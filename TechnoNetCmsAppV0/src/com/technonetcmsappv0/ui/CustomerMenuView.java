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

		MenuItem serviceContract = appMenu.addItem("Service Contract", null, new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		MenuItem complaintMgmtMenu = appMenu.addItem("Complaint Management", null, new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		MenuItem masterMenu = appMenu.addItem("Master", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		MenuItem orgMenu = appMenu.addItem("Organization", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		MenuItem adminMenu = appMenu.addItem("Admin", null, null);
		MenuItem helpMenu = appMenu.addItem("Help", null, null);
		MenuItem exitMenu = appMenu.addItem("Exit", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});

		complaintMgmtMenu.addItem("Complaint", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		complaintMgmtMenu.addItem("Assign", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		complaintMgmtMenu.addItem("Close", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		complaintMgmtMenu.addItem("Re-Assign", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});

		adminMenu.addItem("profile", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		MenuItem settingMenu = adminMenu.addItem("setting", null, null);
		MenuItem dataMenu = adminMenu.addItem("data", null, null);
		dataMenu.addItem("backup", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		dataMenu.addItem("restore", null, new Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				// TODO Auto-generated method stub
				getUI().getNavigator().navigateTo(CustomerTabSheetView.custTabSheetViewName);
			}
		});
		adminMenu.addItem("Force Logout", null, null);

		layout.addComponent(appMenu);
		return layout;

	}

}
