package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Widget;

public class CharactersView extends Composite  {

	private static FormCharactersViewUiBinder uiBinder = GWT
			.create(FormCharactersViewUiBinder.class);

	interface FormCharactersViewUiBinder extends
			UiBinder<Widget, CharactersView> {
	}

	public CharactersView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField Button terugKnop;
	@UiField Button verwijderCharKnop;
	@UiField Button nieuwCharKnop;
	@UiField FlexTable karakters;
	

	  private void setupTable() {
		    karakters = new FlexTable();
		    karakters.setText(0, 0, "naam karakter");
		    karakters.setText(0, 1, "level?");
		 // karakters van speler toevoegen aan lijst  
		 // karakters.insertRow(1);
		  }

		@UiHandler("nieuwCharKnop")
			// er wordt een nieuwe pagina geladen waar en een nieuw karakter eigenschappen kan geven
			void onClickNieuw(ClickEvent e) {
				History.newItem("makeCharView");
				new MakeCharController();
			}
			

		@UiHandler("verwijderCharKnop")
			// het karakter wordt verwijderd in de databank
			void onClickVerwijderen(ClickEvent e) {
				//deleteChar();
			}
			
		@UiHandler("terugKnop")
			// terug keren naar de homepagina HISTORYMANAGEMENT
			void onClickTerugKnop(ClickEvent e) {				
			    }



}
