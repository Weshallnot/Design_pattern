package com.pattern.structural.composite;

public class Circle implements Shape{

	@Override
	public void draw(String fillColour) {
		System.out.println("Drawing circle with colour::" + fillColour);
	}

}
