package com.johnbryce.lesson.hw16;

public class Triangle extends GraphicObject {

	public Triangle(int color_) {
		fillColor = color_;
	}

	public Triangle(int x_, int y_) {
		x = x_;
		y = y_;
	}

	@Override
	void draw() {
		System.out.println("draw a triangle");
	}

	@Override
	void resize() {
		System.out.println("resized the triangle to a new size");
	}

	@Override
	void strech() {
		// TODO Auto-generated method stub
		
	}

}
