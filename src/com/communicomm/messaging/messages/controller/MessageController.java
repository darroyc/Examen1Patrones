package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.enums.MessageType;
import com.communicom.messaging.messages.factory.MessageFactory;

public class MessageController {
	private ArrayList<Message> messages = new ArrayList<Message>();
	
	public void sendMessage(int messageOption) throws Exception {
		messages.add(MessageFactory.createNewMessage(MessageType.values()[messageOption-1]));
	}

	public void listMessage(int messageOption) {
		for (Message currentMessage: messages) {
			if(currentMessage.getMessageNumber()==(messageOption)) {
				System.out.println(currentMessage);
			}
		}
	}
}
