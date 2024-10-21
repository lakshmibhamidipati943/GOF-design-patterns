package com.design_pattern.mediator;
import com.design_pattern.mediator.User;
public class UserImpl extends User{

	public UserImpl(ChatMediator med, String name) {
		// TODO Auto-generated constructor stub
		super(med, name);
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+":Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+": Received Message: "+msg);
	}

}
