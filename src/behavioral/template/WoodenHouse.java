package com.pattern.behavioral.template;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("Building wooden walls.");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building pillars with wooden coating.");
	}

}
