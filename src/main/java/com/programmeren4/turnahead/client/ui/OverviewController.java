package com.programmeren4.turnahead.client.ui;

import com.google.gwt.user.client.ui.RootPanel;

public class OverviewController {

	private Overview overview = new Overview();

	public OverviewController() {
		onLoad();
	}

	public void onLoad() {
		RootPanel.get().clear();
		RootPanel.get().add(overview);
		// System.out.println("Overview => UserID is ");
		// System.out.println(LoginView.IngelogdID.toString());
	}

}
