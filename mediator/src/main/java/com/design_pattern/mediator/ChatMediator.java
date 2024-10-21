package com.design_pattern.mediator;

import com.design_pattern.mediator.User;
public interface ChatMediator {

	public void sendMessage(String msg, User user);
	void addUser(User user1);
	//public void sendMessage(String msg, UserImpl userImpl);
}
