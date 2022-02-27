package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (Visibility Modifier), (Return Type), (Method Name), (Parameters), (Scope)
	
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + 
				", Eye Color: " + eyeColor + ", Weight: " + weight;
	}
	
	void setProperties (String gender, String height, String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
}
