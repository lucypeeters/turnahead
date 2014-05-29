package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Overview extends Composite {

	private static Uibinder1UiBinder uiBinder = GWT
			.create(Uibinder1UiBinder.class);

	interface Uibinder1UiBinder extends UiBinder<Widget, Overview> {
	}

	public Overview() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	// ui field herhalen
	@UiField
	Button terugKnop;
	@UiField
	Button adminKnop;
	@UiField
	Button aanpassenKnop;
	@UiField
	Button charKnop;
	@UiField
	VerticalPanel userDataPanel;

	public Overview(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		terugKnop.setText(firstName);

	}

	@UiHandler("userDataPanel")
	void displayUserData(final String userData) {
		// tonen van SPELERgevens
		// string userData(naam, voornaam, geboortedatum, email,....)
		// methode die userdata in panel gaat plaatsen
		// setUserdata();
	}

	@UiHandler("aanpassenKnop")
	void onClickAanpassenKnop(ClickEvent e) {
		History.newItem("adjustUserDataView");
		new AdjustUserDataController();
	}

	@UiHandler("charKnop")
	void onClickCharKnop(ClickEvent e) {
		History.newItem("charView");
		new CharacterController();
	}

	@UiHandler("adminKnop")
	void onClickAdminKnop(ClickEvent e) {
		// if player is admin else nothing happens
		History.newItem("adminView");
		new AdminController();
	
	}

	@UiHandler("terugKnop")
	// terug keren naar de homepagina of doen in FormOverzichtPagina.xml zelf
	void onClickTerugKnop(ClickEvent e) {
		// HISTORYMANAGEMENT -> terug naar homepagina

	}

}