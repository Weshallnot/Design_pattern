package com.pattern.structural.bridge;

public class Square extends Shape{

	public Square(Renderer renderer) {
		super(renderer);
	}

	@Override
	public void draw() {
		System.out.println("Draw a square.");
	}

}
