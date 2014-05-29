package com.programmeren4.turnahead.client.ui;

import com.google.gwt.user.client.ui.RootPanel;

public class AdminController {
	private AdminView adminForm = new AdminView();

	public AdminController() {
		super();
		onLoad();
	}

	public void onLoad() {
		
		RootPanel.get().add(adminForm);
	}
}
