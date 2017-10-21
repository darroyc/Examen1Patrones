package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.enums.SignalType;

public class SetWaitForSignalRequest extends Message {
	private SignalType signal;
	private String signalValue;
	
	public SetWaitForSignalRequest(){
		super(3, LocalDateTime.now(), "SetWaitForSignalRequest");
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
}
