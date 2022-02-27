package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		//Class is a blueprint for an object
		//Object -> a Noun, an Instantiation of a Class
		
		Human brandonRiley = new Human();
		brandonRiley.setProperties("Male", "510\"", "210", "Brown");
		System.out.println(brandonRiley.getInfo());
		
		Human elonMusk = new Human();
		elonMusk.setProperties("Male", "6'1\"", "190", "Brown");
		System.out.println(elonMusk.getInfo());
		
		Human shannonElizabeth = new Human();
		shannonElizabeth.setProperties("Female", "5'7\"", "135", "Brown");
		System.out.println(shannonElizabeth.getInfo());
		
	}

}
