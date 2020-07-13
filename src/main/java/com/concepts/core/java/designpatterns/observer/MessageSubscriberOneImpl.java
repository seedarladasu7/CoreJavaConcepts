package com.concepts.core.java.designpatterns.observer;

public class MessageSubscriberOneImpl implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOneImpl :: " + m.getMessageContent());
	}
}