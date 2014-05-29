package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellBrowser;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class AdminView extends Composite  {

	private static FormAdminViewUiBinder uiBinder = GWT
			.create(FormAdminViewUiBinder.class);

	interface FormAdminViewUiBinder extends UiBinder<Widget, AdminView> {
	}

	public AdminView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Button terugKnop;
	@UiField Button itemsToevoegenKnop;
	@UiField Button locatiesToevoegenKnop;
	@UiField Button verwijderenKnop;
	@UiField CellBrowser aanwezig;

	// locations-------------------------------------------------------------------------------
			// toont aanwezige locatie van wereld in de vorm van een listbox
			@UiHandler("aanwezig")
			void displayLocations(final String locations){
				//in deze komen de locaties in eerste kolom aanwezig in het spel;
				// in onerverdeling komen de items aanwezig in het spel
			}
			void displayItems(final String items){
				//in deze komen de locaties in eerste kolom aanwezig in het spel;
				// in onerverdeling komen de items aanwezig in het spel
			}
			
			@UiHandler("terugKnop")
			// terug keren naar de homepagina HISTORYMANAGEMENT
			void onClickTerugKnop(ClickEvent e) {				
			    }
			
			@UiHandler("verwijderenKnop")
			
			void onClickVerwijderKnop(ClickEvent e) {	
				//geselecteerde items en locaties worden verwijderd
			    }

			@UiHandler("locatiesToevoegenKnop")
			void onClickLocatiesToevoegenKnop(ClickEvent e) {	
				History.newItem("locationView");
				new LocationController();
			    }

			@UiHandler("itemsToevoegenKnop")
			//  HISTORYMANAGEMENT
			void onClickItemsToevoegenKnop(ClickEvent e) {	
				History.newItem("addItemView");
				new AddItemView();
			    }

}
