package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;

	public Human() {
		
	}
	
@Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}



	public void startPumping() {
		heart.pump();
	}
}
