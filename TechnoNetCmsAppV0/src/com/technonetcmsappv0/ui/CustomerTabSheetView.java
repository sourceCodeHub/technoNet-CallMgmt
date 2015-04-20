package com.technonetcmsappv0.ui;

import com.technonetcmsappv0.dao.UpdateCustomerDemographics;
import com.vaadin.data.Item;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.fieldgroup.PropertyId;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

public class CustomerTabSheetView extends CustomComponent implements View {

	private TabSheet customerTabSheet;
	public static final String custTabSheetViewName = "customer";

	@PropertyId("FIRST_NAME")
	private TextField firstName = new TextField("First Name");
	@PropertyId("MIDDLE_NAME")
	private TextField middleName = new TextField("Middle Name");
	@PropertyId("LAST_NAME")
	private TextField lastName = new TextField("Last Name");
	@PropertyId("ADDREESS")
	private TextField address = new TextField("Address");
	@PropertyId("PHONE")
	private TextField phone = new TextField("Phone");
	private FieldGroup fieldGroup;

	CommonComponents commonComponents = new CommonComponents();

	UpdateCustomerDemographics addCustomer = new UpdateCustomerDemographics();

	public CustomerTabSheetView() {
		customerTabSheet = new TabSheet();
		customerTabSheet.setImmediate(false);
		customerTabSheet.setSizeFull();
		// customerTabSheet.setCaption("CustomerInfo");
		VerticalLayout vertlayout = new VerticalLayout();
		Label headerLable = new Label("Customer Application");
		headerLable.setStyleName(Reindeer.LABEL_H1);
		vertlayout.addComponent(headerLable);

		vertlayout.addComponent(customerTabSheet);
		setCompositionRoot(vertlayout);
		HorizontalLayout customerTabContent = commonComponents
				.getHorizontalLayout();
		FormLayout form = new FormLayout();
		form.addComponent(new TextField("Username"));
		form.addComponent(new TextField("Password"));
		form.addComponent(new Button("Login", new ClickListener() {

			public void buttonClick(ClickEvent event) {

			}
		}));
		customerTabContent.addComponent(form);

		customerTabSheet.addTab(customerTabContent);
		customerTabSheet.getTab(customerTabContent).setCaption("Customer");

		FormLayout memberTabLayout = commonComponents.getFormLayout();
		HorizontalLayout buttonLayout = commonComponents.getHorizontalLayout();
		buttonLayout.setSpacing(true);

		memberTabLayout.addComponent(firstName);
		memberTabLayout.addComponent(middleName);
		memberTabLayout.addComponent(lastName);
		memberTabLayout.addComponent(address);
		memberTabLayout.addComponent(phone);
		buttonLayout.addComponent(new Button("SUBMIT", new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Item item = null;
				Notification.show("Submitted");
			   
				fieldGroup = new FieldGroup(item);
				fieldGroup.bindMemberFields(this);
				addCustomer.insertCustomerDemographics(fieldGroup);
			}
		}));

		buttonLayout.addComponent(new Button("CANCEL", new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Notification.show("Cancelled");

			}
		}));

		buttonLayout.addComponent(new Button("RESET", new ClickListener() {

			public void buttonClick(ClickEvent event) {
				Notification.show("reset");
			}
		}));
		customerTabSheet.addTab(memberTabLayout);
		customerTabSheet.getTab(memberTabLayout).setCaption("Member");
		memberTabLayout.addComponent(buttonLayout);

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Entered");

	}

}
