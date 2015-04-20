package com.technonetcmsappv0.ui;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

@SuppressWarnings("serial")
@Theme("technonetcmsappv0")
public class Technonetcmsappv0UI extends UI {

	

	CommonComponents commonComponents = new CommonComponents();

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Technonetcmsappv0UI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout layout = new VerticalLayout();
		setSizeFull();
		layout.setMargin(true);

		Label headerLable = new Label("Customer Application");
		headerLable.setStyleName(Reindeer.LABEL_H1);
		layout.addComponent(headerLable);

	
		// Changes made for login page navigation

		Navigator navigator = new Navigator(this, this);
		navigator.addView(SimpleLoginForm.Name, SimpleLoginForm.class);
		navigator.addView(SimpleLoginMainForm.NAME,	SimpleLoginMainForm.class);
		navigator.addView("customer", new CustomerTabSheetView());

		getNavigator().addViewChangeListener(new ViewChangeListener() {

			@Override
			public boolean beforeViewChange(ViewChangeEvent event) {

				// Check if a user has logged in
				boolean isLoggedIn = getSession().getAttribute("user") != null;
				boolean isLoginView = event.getNewView() instanceof SimpleLoginForm;

				if (!isLoggedIn && !isLoginView) {
					// Redirect to login view always if a user has not yet
					// logged in
					getNavigator().navigateTo(SimpleLoginForm.Name);
					return false;

				} else if (isLoggedIn && isLoginView) {
					// If someone tries to access to login view while logged in,
					// then cancel
					return false;
				}

				return true;
			}

			@Override
			public void afterViewChange(ViewChangeEvent event) {
				
			}
		});

		setContent(layout);
	}

}