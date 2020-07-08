package io.swagger.model;


public class Message {
	 Intent IntentObject;

	 public static Intent  newIntent() {
		  return new Intent();
	  }
	  
	  
	 // Getter Methods 

	 public Intent getIntent() {
	  return IntentObject;
	 }

	 // Setter Methods 

	 public void setIntent(Intent intentObject) {
	  this.IntentObject = intentObject;
	 }
}