package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class CharAanmaken extends Composite  {

	private static CharAanmakenUiBinder uiBinder = GWT
			.create(CharAanmakenUiBinder.class);

	interface CharAanmakenUiBinder extends UiBinder<Widget, CharAanmaken> {
	}

	public CharAanmaken() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button OKbutton;
	Button cancelButton;
	TextBox naam;
	TextBox geslacht;

	@UiHandler("naam")
	public String getNaam(){
		// naam return die in textbox in ingegeven
		return naam.getText();
		
	}
	
	public String getGeslacht(){
		// return geslacht dat in textbox geslacht is ingevuld
		return geslacht.getText();
		
	}
	
	
	@UiHandler("OKbutton")
	void onClickOKknop(ClickEvent e) {
		// char wordt toegevoegd aan databankwindow
		Window.alert("char toegevoegd aan databank");
		// char toevoegen aan databank
		String naamDB = getNaam();
		String geslachtDB= getGeslacht();
		
		
	}
	@UiHandler("cancelButton")
	void onClickcancelKnop(ClickEvent e) {
		// de bewerking wordt afgebroken en men wordt terug gestuurd naar de overzichtspagina
		FormOverzichtsPagina formOverzichtspagina = new FormOverzichtsPagina();
		RootPanel.get().clear();
		RootPanel.get().add(formOverzichtspagina);
	}

	

	

}