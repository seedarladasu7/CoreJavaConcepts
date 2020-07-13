package com.concepts.core.java.designpatterns.observer;

public class MessageSubscriberThreeImpl implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThreeImpl :: " + m.getMessageContent());
	}
}
