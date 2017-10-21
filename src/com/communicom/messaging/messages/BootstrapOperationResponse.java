package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationResponse extends Message {
	private boolean result;
	private String errorMessage;
	
	public BootstrapOperationResponse(){
		super(6, LocalDateTime.now(), "BootstrapOperationResponse");
	}
	
	public boolean isResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
