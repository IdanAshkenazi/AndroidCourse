package com.johnbryce.lesson.exceptions;

import java.util.Scanner;

import com.sun.org.omg.CORBA.ExceptionDescription;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * try { int [] aaa = new int[5]; aaa[5]=0; } catch (Exception e) {
		 * System.out.println(e.toString()); }
		 * 
		 * finally{ System.out.println("we still got here"); } final int x=5;
		 */
		int y = 7;
		double k = 2.3;
		Person p1 = new Person();
		Dog myDog = new Dog();
		myDog.name = "Lasy";
		p1.func1(y, k, myDog);
		System.out.println("after " + y);
		System.out.println("after " + k);
		System.out.println("after " + myDog.name);
	}

}
