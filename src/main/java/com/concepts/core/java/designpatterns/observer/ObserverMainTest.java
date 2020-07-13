package com.concepts.core.java.designpatterns.observer;

public class ObserverMainTest {
	public static void main(String[] args) {
		MessageSubscriberOneImpl s1 = new MessageSubscriberOneImpl();
		MessageSubscriberTwoImpl s2 = new MessageSubscriberTwoImpl();
		MessageSubscriberThreeImpl s3 = new MessageSubscriberThreeImpl();

		MessagePublisher p = new MessagePublisher();

		p.attach(s1);
		p.attach(s2);
		p.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update

		p.detach(s1);
		p.attach(s3);
		p.notifyUpdate(new Message("Second Message")); // s2 and s3 will receive the update
	}
}
