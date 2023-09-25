package com.pattern.structural.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String fillColour) {
		System.out.println("Drawing triangle with colour::" + fillColour);
	}

}
