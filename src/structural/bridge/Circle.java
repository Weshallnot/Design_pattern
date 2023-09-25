package com.pattern.structural.bridge;

public class Circle extends Shape {

	public Circle(Renderer renderer) {
		super(renderer);
	}

	@Override
	public void draw() {
		System.out.println("Draw a circle.");
	}

}
