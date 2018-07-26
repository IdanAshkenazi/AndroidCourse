package com.johnbryce.lesson.hw16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		ArrayList<Circle> list = new ArrayList<Circle>();
		list.add(circle);
		Collections.sort(list);
		circle.color = 0x1100FF;
		circle.fillColor = 0xFF0022;
		ArrayList<GraphicObject> list2 = new ArrayList<GraphicObject>();
		Circle circleCanvas = new Circle();
		Triangle triangleCanvas = new Triangle(0, 5);
		Rectangle rectangleCanvas = new Rectangle();
		Circle circleCanvas2 = new Circle();
		Triangle triangleCanvas2 = new Triangle(5, 7);
		list2.add(circleCanvas);
		list2.add(rectangleCanvas);
		list2.add(circleCanvas2);
		list2.add(triangleCanvas2);
		list2.add(triangleCanvas);
		Canvas canvas = new Canvas();
		canvas.listOfShapes = list2;
		canvas.drawAll(list2);
		canvas.clear();
		canvas.strechAll();
	}

}
