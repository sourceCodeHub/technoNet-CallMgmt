package com.technonetcmsappv0.ui;

import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

public class CommonComponents {

	public HorizontalLayout getHorizontalLayout(){
		HorizontalLayout layout = new HorizontalLayout();
		layout.setSizeFull();
		return layout;
	}
	
	
	public VerticalLayout getVerticalLayout(){
		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();
		return layout;
	}
	
	
	public AbsoluteLayout getAbsoluteLayout(){
		AbsoluteLayout layout = new AbsoluteLayout();
		layout.setSizeFull();
		return layout;
	}
	
	public FormLayout getFormLayout(){
		FormLayout layout = new FormLayout();
		layout.setSizeFull();
		return layout;
	}
}
