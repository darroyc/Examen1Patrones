package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class Message {
	protected int messageNumber;
	protected LocalDateTime emisionTime;
	protected String messageName;
	private String sourceAddress;
	private String targetAddress;
	private String version;
	
	public Message(int messageNumber, LocalDateTime emisionTime, String messageName) {
		this.messageNumber = messageNumber;
		this.emisionTime = emisionTime;
		this.messageName = messageName;
	}

	public int getMessageNumber() {
		return messageNumber;
	}
	
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	
	public String getMessageName() {
		return messageName;
	}
	
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}	
	
	public String getSourceAddress() {
		return sourceAddress;
	}
	
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	
	public String getTargetAddress() {
		return targetAddress;
	}
	
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "\nMessage Number: " + messageNumber +
				"\nEmision Time: " + emisionTime +
				"\nMessage Name: "+ messageName;
	}
	
	
}
