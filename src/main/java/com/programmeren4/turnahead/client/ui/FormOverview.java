package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import javax.persistence.EntityManager;

import com.programmeren4.turnahead.EMF;
import com.programmeren4.turnahead.client.ui.DataUser;

public class FormOverview extends Composite {
	
	private static Uibinder1UiBinder uiBinder = GWT
			.create(Uibinder1UiBinder.class);

	interface Uibinder1UiBinder extends UiBinder<Widget, FormOverview> {
	}

	public FormOverview() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	// ui field herhalen
	@UiField
	Button terugKnop;
	@UiField
	Button aanpassenKnop;
	@UiField
	VerticalPanel userDataPanel;
	/*
	CellList<String> karaktersGegevens;
	Label naam;
	Label voorNaam;
	Label email;
	Label geboortedatum;
	VerticalPanel persoonsGegevensLabel;*/
	
	public FormOverview(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		terugKnop.setText(firstName);	
		
	}
// userdatapanel-------------------------------------------------------------------------	
	//data uit databank halen voor persoonsgegevens
	// BEDOELING : haalt uit databank via DataUser.java
		@UiHandler("userDataPanel") 
		void displayUserData(DataUser tekst) {
			 EntityManager em = EMF.get().createEntityManager();
			 try {
			      tekst.toStr();
			    } finally {
			        em.close();
			    }
			 
			 }
		
		
		
	   
//----------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------

		
//----------------------------------------------------------------------------------------
		// userdatapanel------------------------------------------------------------------------
		// userdatapanel------------------------------------------------------------------------

	@UiHandler("terugKnop")
	// terug keren naar de homepagina of doen in FormOverzichtPagina.xml zelf
	void onClickTerugKnop(ClickEvent e) {
//		// voor compleet nieuwe url buiten appalicatie
//		//Window.Location.assign("com.lucypeeters.test2.client.client.home.Home");
//		
//		FormHome formHome = new FormHome();
//		RootPanel.get().clear();
//		RootPanel.get().add(formHome);
//
//		// met controller werken goto()
		
	    }

	
	
}
