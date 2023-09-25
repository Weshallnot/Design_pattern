package com.pattern.structural.bridge;

public class Raster implements Renderer {

	@Override
	public void renderShape() {
		System.out.println("Rendering shape in raster graphics.");
	}

}
