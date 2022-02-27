package com.coderscampus.objects;

import java.util.Scanner;

public class Calculation {
	String output() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type In a Number Between 50 and 300: ");
		String input = scanner.nextLine();
		int convertedInput = Integer.parseInt(input);
		
		if (convertedInput >= 50 && convertedInput <= 300) {
			System.out.println ("The Number You Typed in was: " + convertedInput);
		}
		else {
			System.out.println ("The number you typed in was:" + null);
		}
		return "";
}
}
