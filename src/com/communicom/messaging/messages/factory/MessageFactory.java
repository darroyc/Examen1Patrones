package com.communicom.messaging.messages.factory;

import com.communicom.messaging.messages.*;
import com.communicom.messaging.messages.enums.MessageType;

public final class MessageFactory {

	public static Message createNewMessage(MessageType type) throws Exception {

		switch(type){
			case BootstrapOperationRequest:
				return new BootstrapOperationRequest();
			case BootstrapOperationResponse:
				return new BootstrapOperationResponse();
			case PingServerRequest:
				return new PingServerRequest();
			case PingServerResponse:
				return new PingServerResponse();
			case SetWaitForSignalRequest:
				return new SetWaitForSignalRequest();
			case SetWaitForSignalResponse:
				return new SetWaitForSignalResponse();
		}
		throw new Exception("Invalid Message");
	}
}

