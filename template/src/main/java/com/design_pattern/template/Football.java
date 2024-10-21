package com.design_pattern.template;

public class Football extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Football game Initialized! Start playing");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Football Game Finished!");
	}

}
