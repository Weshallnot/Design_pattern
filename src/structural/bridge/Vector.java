package com.pattern.structural.bridge;

public class Vector implements Renderer{
	
	@Override
	public void renderShape() {
		System.out.println("Rendering shape in vector graphics.");
	}
}
