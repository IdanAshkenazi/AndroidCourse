package com.johnbryce.lesson.hw16;

public abstract class GraphicObject {
	int x, y;
	int color;
	int fillColor;

	void moveTo(int newX, int newY) {

	}

	abstract void draw();

	abstract void resize();
	
	abstract void strech();
}