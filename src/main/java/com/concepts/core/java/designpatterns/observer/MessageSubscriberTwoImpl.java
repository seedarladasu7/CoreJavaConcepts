package com.concepts.core.java.designpatterns.observer;

public class MessageSubscriberTwoImpl implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwoImpl :: " + m.getMessageContent());
	}
}
