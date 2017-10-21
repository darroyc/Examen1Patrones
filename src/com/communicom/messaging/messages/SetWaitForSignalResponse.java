package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.enums.SignalType;

public class SetWaitForSignalResponse extends Message {
	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;
	
	public SetWaitForSignalResponse(){
		super(4, LocalDateTime.now(), "SetWaitForSignalResponse");
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}

	public void signalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}
}
