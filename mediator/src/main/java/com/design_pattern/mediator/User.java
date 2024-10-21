package com.design_pattern.mediator;

public abstract class User {

	protected ChatMediator mediator;
	protected String name;
	public User(ChatMediator med, String name) {
		// TODO Auto-generated constructor stub
		this.mediator=med;
		this.name=name;
	}
	public abstract void send(String msg);
	public abstract void receive(String msg);
}
