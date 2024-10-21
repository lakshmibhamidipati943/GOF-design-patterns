package com.design_pattern.observer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ObserverApplication.class, args);
		NewsAgency observable=new NewsAgency();
		NewsChannel observer=new NewsChannel();
		observable.addObserver(observer);
		observable.setNews("news");
		System.out.println(observer.getNews());
	}

}
