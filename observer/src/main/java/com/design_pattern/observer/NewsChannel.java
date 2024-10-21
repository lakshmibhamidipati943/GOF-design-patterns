package com.design_pattern.observer;

public class NewsChannel implements Channel{

	private String news;
	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		this.setNews((String) news);
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news=news;
	}
}
