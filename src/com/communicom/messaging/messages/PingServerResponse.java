package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends Message {
	
	public PingServerResponse(){
		super(1, LocalDateTime.now(), "PingServerResponse");
	}
}
