package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class AddItemView extends Composite {

	private static FormItemsUiBinder uiBinder = GWT
			.create(FormItemsUiBinder.class);

	interface FormItemsUiBinder extends UiBinder<Widget, AddItemView> {
	}

	public AddItemView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField
	Button terugKnop;
	
	@UiField
	ListBox locaties;

	@UiField
	Button okKnop;

	public AddItemView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		
	}
	@UiHandler("locaties")
	void displayLocations(final String locations){
		//in deze komen de locaties in eerste kolom aanwezig in het spel;
	
	}
	@UiHandler("okKnop")
	void onClickOkKnop(ClickEvent e) {
		// wijzigingen aan items opslaan in databank
	}
	@UiHandler("terugKnop")
	void onClickTerugKnop(ClickEvent e) {
		///
	}


	

	
}
