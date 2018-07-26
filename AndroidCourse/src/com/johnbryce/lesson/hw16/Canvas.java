package com.johnbryce.lesson.hw16;

import java.util.*;

public class Canvas {

	ArrayList<GraphicObject> listOfShapes = new ArrayList<GraphicObject>();

	void drawAll(ArrayList<GraphicObject> listOfShapes) {
		for (GraphicObject i : listOfShapes) {
			i.draw();
		}
	}

	void resizeAll() {
		for (GraphicObject k : listOfShapes) {
			k.resize();
		}
	}

	public void clear() {
		listOfShapes.clear();
	}

	public void strechAll() {
		for (GraphicObject k : listOfShapes) {
			k.strech();
		}
	}
}
