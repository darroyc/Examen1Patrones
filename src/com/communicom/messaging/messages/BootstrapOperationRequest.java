package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationRequest extends Message {

	public BootstrapOperationRequest(){
		super(5, LocalDateTime.now(), "BootstrapOperationRequest");
	}
}
