package com.design_pattern.state;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	public String toString() {
		return "Stop State";
	}
}
