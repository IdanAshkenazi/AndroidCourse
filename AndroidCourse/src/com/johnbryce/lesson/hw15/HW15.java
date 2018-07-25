package com.johnbryce.lesson.hw15;

import java.util.ArrayList;
import java.util.Scanner;

public class HW15 {

	public static void main(String[] args) {
		System.out.println("Insert String");
		ArrayList<String> list = new ArrayList<String> ();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		while(!input.equals("stop"))
		{
			list.add(input);
			input = scanner.nextLine();
		}
		scanner.close();
			System.out.println("The Strings recieved by the user are: " + list.toString());	
	}

}
