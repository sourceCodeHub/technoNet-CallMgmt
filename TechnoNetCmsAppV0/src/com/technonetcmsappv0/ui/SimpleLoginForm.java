package com.technonetcmsappv0.ui;

import com.vaadin.data.validator.EmailValidator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

public class SimpleLoginForm extends CustomComponent implements View {

	public static String Name = "login";
	private final TextField user;
	private final PasswordField password;
	private final Button loginButton;

	public SimpleLoginForm() {
		setSizeFull();
		user = new TextField("User:");
		user.setWidth("300px");
		user.setRequired(true);
		user.setInputPrompt("Your username (eg. joe@email.com)");
		user.addValidator(new EmailValidator(
				"Username must be an email address"));
		user.setInvalidAllowed(false);

		password = new PasswordField("Password:");
		password.setWidth("300px");
		// password.addValidator(new PasswordValidator());
		password.setRequired(true);
		password.setValue("");
		password.setNullRepresentation("");

		loginButton = new Button("Login Button", new ClickListener() {

			public void buttonClick(ClickEvent event) {
				//
				// Validate the fields using the navigator. By using validors
				// for the
				// fields we reduce the amount of queries we have to use to the
				// database
				// for wrongly entered passwords
				//
				if (!user.isValid() || !password.isValid()) {
					return;
				}

				String username = user.getValue();
				String password1 = password.getValue();
				

				//
				// Validate username and password with database here. For
				// examples sake
				// I use a dummy username and password.
				//
				boolean isValid = username.equals("test@test.com")
						&& password1.equals("passw0rd");

				if (isValid) {

					// Store the current user in the service session
					getSession().setAttribute("user", username);

					// Navigate to main view
//					getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
					getUI().getNavigator().navigateTo(CustomerMenuView.customerMenuView);
				} else {

					// Wrong password clear the password field and refocuses it
				password.setValue("");
				password.focus();

				}

			}
		});

		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSizeFull();
		Label headerLable = new Label("Member Register");
		headerLable.setStyleName(Reindeer.LABEL_H1);
		mainLayout.addComponent(headerLable);
		
//		mainLayout.setMargin(true);

		
		
		FormLayout fields = new FormLayout(user, password, loginButton);
		fields.setCaption("Please login to access the application. (test@test.com/passw0rd)");
		fields.setSpacing(true);
//		fields.setMargin(new MarginInfo(true, true, true, false));
//		fields.setSizeUndefined();
		
//		mainLayout.addComponent(fields);

		FormLayout viewLayout = new FormLayout(fields);
		viewLayout.setSizeFull();
		viewLayout.setComponentAlignment(fields, Alignment.MIDDLE_CENTER);
		viewLayout.setStyleName(Reindeer.LAYOUT_BLUE);
		mainLayout.addComponent(viewLayout);
		mainLayout.setExpandRatio(viewLayout, 1);
		setCompositionRoot(mainLayout);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		user.focus();

	}

}
