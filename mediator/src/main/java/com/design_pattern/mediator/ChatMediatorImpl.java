package com.design_pattern.mediator;

import java.util.ArrayList;
import java.util.List;

import com.design_pattern.mediator.User;
public class ChatMediatorImpl implements ChatMediator{

	private List<User> users;
	public ChatMediatorImpl() {
		this.users=new ArrayList<>();
	}
	@Override
	public void sendMessage(String msg, User user) {
		// TODO Auto-generated method stub
		for(User u: this.users) {
			if(u != user) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}

}
