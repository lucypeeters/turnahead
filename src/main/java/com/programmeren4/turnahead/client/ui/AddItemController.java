package com.programmeren4.turnahead.client.ui;

import com.google.gwt.user.client.ui.RootPanel;

public class AddItemController {

	private AddItemView itemForm = new AddItemView();

	public AddItemController() {
		super();
		onLoad();
	}

	public void onLoad() {
		RootPanel.get().clear();
		RootPanel.get().add(itemForm);
	}
}
