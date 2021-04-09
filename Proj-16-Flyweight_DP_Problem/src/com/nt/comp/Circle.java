package com.nt.comp;

public class Circle implements IShape{
	private String label;
	
	public Circle() {
		System.out.println("Circle:0-Param Constructor");
		label="circle";
	}

	@Override
	public void draw(float radius, String fillColor, String lineStyle) {
		System.out.println("Drawing Circle with radius "+radius+" having fillColor"+ fillColor+" ,lineStyle:: "+lineStyle);
		
	}

}
