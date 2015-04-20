package com.technonetcmsappv0.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;
import com.vaadin.ui.MenuBar.Command;

;
public class CustomerMenuView extends CustomComponent implements View {

	public static final String customerMenuView = "CUSTOMER_VIEW";

	public CustomerMenuView() {
		VerticalLayout layout = new VerticalLayout();
		Label headerLable = new Label("Customer Application");
		headerLable.setStyleName(Reindeer.LABEL_H2);
		layout.addComponent(headerLable);
		setCompositionRoot(setCustomerMenuLayout(layout));

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Inside View");

	}

	public VerticalLayout setCustomerMenuLayout(VerticalLayout layout) {
		MenuBar appMenu = new MenuBar();
		// appMenu.setSizeFull();
		appMenu.setAutoOpen(true);
		
		MenuItem serviceContract = appMenu.addItem("Service Contract", null, null);
		MenuItem complaintMgmtMenu = appMenu.addItem("Complaint Management", null, null);
		MenuItem masterMenu = appMenu.addItem("Master", null, null);
		MenuItem orgMenu = appMenu.addItem("Organization", null, null);
		MenuItem adminMenu = appMenu.addItem("Admin", null, null);
		MenuItem helpMenu = appMenu.addItem("Help", null, null);
		MenuItem exitMenu = appMenu.addItem("Exit", null, null);

		complaintMgmtMenu.addItem("Complaint", null, null);
		complaintMgmtMenu.addItem("Assign", null, null);
		complaintMgmtMenu.addItem("Close", null, null);
		complaintMgmtMenu.addItem("Re-Assign", null, null);

		adminMenu.addItem("profile", null, null);
		MenuItem settingMenu = adminMenu.addItem("setting", null, null);
		MenuItem dataMenu = adminMenu.addItem("data", null, new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);

			}
		});
//		dataMenu.addItem("backup", null, null);
//		dataMenu.addItem("restore", null, null);
		adminMenu.addItem("Force Logout", null, null);

		layout.addComponent(appMenu);
		return layout;

	}

}
