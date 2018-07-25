package com.johnbryce.lesson.hw15;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

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
			System.out.println(list.toString());	
	}

}
