package com.design_pattern.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TemplateApplication.class, args);
		Game game=new Cricket();
		game.play();
		System.out.println();
		game=new Football();
		game.play();
	}

}
