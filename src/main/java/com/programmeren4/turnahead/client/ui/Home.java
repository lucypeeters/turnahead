package com.programmeren4.turnahead.client.ui;



import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint  {
	
	private FormHome form = new FormHome();
	

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(form);
		//Window.alert("hello world");

		//History.newItem(historyToken1);
	}

	

}
