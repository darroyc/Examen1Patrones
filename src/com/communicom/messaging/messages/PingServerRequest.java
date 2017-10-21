package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends Message {
	
	public PingServerRequest(){
		super(1, LocalDateTime.now(), "PingServerRequest");
	}
}
