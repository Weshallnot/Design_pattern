package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

	private List<Shape> shapes = new ArrayList<>();
	
	@Override
	public void draw(String fillColour) {
		shapes.stream().forEach(s->{s.draw(fillColour);});
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}

	public void remove(Shape s) {
		shapes.remove(s);
	}
	
	public void clear() {
		System.out.println("Cleared!");
		this.shapes.clear();
	}
}
