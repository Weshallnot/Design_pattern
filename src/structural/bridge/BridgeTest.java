package com.pattern.structural.bridge;

public class BridgeTest {
	public static void main(String[] args) {
		
		Renderer rasterRenderer = new Raster();
		Renderer vectorRenderer = new Vector();
		
		Circle circle = new Circle(rasterRenderer);
		ShapeRenderer circleRenderer = new ShapeRenderer(circle, rasterRenderer);
		circleRenderer.render();
		
		Square square = new Square(vectorRenderer);
		ShapeRenderer squareRenderer = new ShapeRenderer(square, vectorRenderer);
		squareRenderer.render();
	}
}
