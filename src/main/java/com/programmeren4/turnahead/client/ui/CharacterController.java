package com.programmeren4.turnahead.client.ui;

import com.google.gwt.user.client.ui.RootPanel;

public class CharacterController {

	private CharactersView charForm = new CharactersView();

	public CharacterController() {
		super();
		onLoad();
	}

	public void onLoad() {
		RootPanel.get().clear();
		RootPanel.get().add(charForm);
	}
}
