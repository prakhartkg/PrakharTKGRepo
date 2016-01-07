package com.yash.cdix;

import com.yash.cdix.GreenType.MessageType;

@GreenType(type=MessageType.Diwali)
public class DiwaliGreeting implements IfcGreeting{

	
	private String message="Hello World";
	
	
	public void setMessage(String message) {
		this.message = message;
	}


	public String getMessage(){
		return message;
	}
	
}
