package com.programmeren4.turnahead.client.ui;

import com.google.gwt.user.client.ui.RootPanel;

public class MakeCharController {

	private MakeCharView makeCharForm = new MakeCharView();

	public MakeCharController() {
		super();
		onLoad();
	}

	public void onLoad() {
		RootPanel.get().add(makeCharForm);
	}
}
