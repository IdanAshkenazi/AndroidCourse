package com.johnbryce.lesson.hw16;

class Circle extends GraphicObject implements Comparable {

	@Override
	void draw() {
		System.out.println("draw a circle");

	}

	@Override
	void resize() {
		System.out.println("resized the circle to a new size");

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void strech() {
		// TODO Auto-generated method stub
		
	}

}
