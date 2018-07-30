package com.johnbryce.lesson.exceptions;

public class Person {

	public void func1(int y, double z, Dog d) {
		System.out.println("before " + y);
		System.out.println("before " + z);
		System.out.println("before " + d.name);
		System.out.println("---------------------");
		y++;
		z = 0.0;
		d.name = "Bingo";

	}

	public void func1() {
	}
}
