package com.programmeren4.turnahead.client;


import com.google.gwt.user.client.ui.RootPanel;
import com.programmeren4.turnahead.client.ui.Namebox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class testsomething  {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
   * Create a remote service proxy to talk to the server-side Greeting service.
   */
//  private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
	  RootPanel.get("nameboxContainer").add(new Namebox());
	  
  }
}