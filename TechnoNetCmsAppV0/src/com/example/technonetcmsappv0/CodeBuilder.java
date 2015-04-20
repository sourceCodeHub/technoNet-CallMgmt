package com.example.technonetcmsappv0;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TabSheet;

public class CodeBuilder extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private TabSheet ProviderTabSheet;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public CodeBuilder() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// ProviderTabSheet
		ProviderTabSheet = new TabSheet();
		ProviderTabSheet.setImmediate(false);
		ProviderTabSheet.setWidth("100.0%");
		ProviderTabSheet.setHeight("100.0%");
		mainLayout.addComponent(ProviderTabSheet,
				"top:20.0px;right:42.0px;bottom:40.0px;left:20.0px;");
		
		return mainLayout;
	}

}
