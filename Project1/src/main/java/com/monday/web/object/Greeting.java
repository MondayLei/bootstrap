package com.monday.web.object;

public class Greeting {

	private int id;
	private String content;

	public void setId(int id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	public void print(){
		System.out.println("Spring Test:"+id);
	}
}