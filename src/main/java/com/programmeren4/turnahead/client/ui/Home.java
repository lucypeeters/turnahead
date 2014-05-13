package com.programmeren4.turnahead.client.ui;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;

public class Home implements EntryPoint {


	private HomeView application = new HomeView();

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(application);
		
		/*History.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				if (){
					
					greetingService.getLocationByID(event.getValue().split("/")[1], new AsyncCallback<String>() {

					@Override
					public void onSuccess(String result) {
					
					}

					@Override
					public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub

					}
					});
					}

					event.getValue();
					}
					});*/


			}
	


	
}
