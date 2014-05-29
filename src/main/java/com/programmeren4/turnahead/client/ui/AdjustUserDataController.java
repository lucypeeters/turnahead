package com.programmeren4.turnahead.client.ui;

import com.google.gwt.user.client.ui.RootPanel;

public class AdjustUserDataController {

	private AdjustUserDataView adjustUserDataForm = new AdjustUserDataView();

	public AdjustUserDataController() {
		super();
		onLoad();
	}

	public void onLoad() {
		RootPanel.get().clear();
		RootPanel.get().add(adjustUserDataForm);
	}
}
