package com.pattern.structural.bridge;

public class ShapeRenderer {
	
	protected Shape shape;
	protected Renderer renderer;
	
	public ShapeRenderer( Shape  shape, Renderer renderer) {
		
		this.shape = shape;
		this.renderer = renderer;
	}
	
	public void render() {
		shape.draw();
		renderer.renderShape();
	}
}
