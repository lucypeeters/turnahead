package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

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
Button adminKnop;
@UiField
Button aanpassenKnop;
@UiField
Button charKnop;
@UiField
VerticalPanel userDataPanel;

public FormOverview(String firstName) {
initWidget(uiBinder.createAndBindUi(this));
terugKnop.setText(firstName);	

}


@UiHandler("userDataPanel")
void displayUserData(final String userData) {
	// tonen van SPELERgevens
// string userData(naam, voornaam, geboortedatum, email,....)
//methode die userdata in panel gaat plaatsen
//setUserdata();
}


@UiHandler("aanpassenKnop")
void onClickTerugKnop(ClickEvent e){
	// hier kan met de SPELERgegevens mee aanpassen
}

@UiHandler("charKnop")
void onClickTerugKnop(ClickEvent e){
	// gaat naar FormCharactersView pagina waar men een lijst van characters wordt 
	//getoont die verbonden zijn met de aangelogde speler
}

@UiHandler("adminKnop")
void onClickTerugKnop(ClickEvent e){
	// gaat naar form admin als speler ook admin is
}


@UiHandler("terugKnop")
// terug keren naar de homepagina of doen in FormOverzichtPagina.xml zelf
void onClickTerugKnop(ClickEvent e) {
// HISTORYMANAGEMENT -> terug naar homepagina

}






}