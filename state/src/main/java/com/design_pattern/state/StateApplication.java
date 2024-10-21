package com.design_pattern.state;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StateApplication.class, args);
		Context context=new Context();
		StartState startState=new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		StopState stopState=new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
