package com.design_pattern.strategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StrategyApplication.class, args);
		Context context=new Context(new OperationAdd());
		System.out.println("10+5="+context.executeStrategy(10,5));
		context=new Context(new OperationSubtract());
		System.out.println("10-5="+context.executeStrategy(10,5));
		context=new Context(new OperationMultiply());
		System.out.println("10*5="+context.executeStrategy(10,5));
	}

}
