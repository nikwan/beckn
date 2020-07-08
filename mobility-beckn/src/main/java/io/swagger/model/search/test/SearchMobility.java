package io.swagger.model.search.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.model.Context;
import io.swagger.model.Message;

@JsonInclude(value = Include.NON_NULL)
public class SearchMobility {
	
	
	public Context context;
	
	public Message message;
	
	public Context getContext() {
		return context;
	}
	public void setContext(Context context) {
		this.context = context;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	  
}