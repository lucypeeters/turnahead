package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class GameView extends Composite {

	private static GameViewUiBinder uiBinder = GWT
			.create(GameViewUiBinder.class);

	interface GameViewUiBinder extends UiBinder<Widget, GameView> {
	}

	public GameView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button gaKnop;
	@UiField
	Button terugKnop;
	@UiField
	ListBox locaties;

	
	@UiHandler("locaties")
	void displayUserData(final String locaties) {
		// locaties worden geladen in spel
	}
	
	@UiHandler("gaKnop")
	void onClickGaKnop(ClickEvent e) {
		// karakter gaat naar andere locatie
	}

	@UiHandler("terugKnop")
	void onClickTerugKnop(ClickEvent e) {
		//history management
	}

	
	

}
