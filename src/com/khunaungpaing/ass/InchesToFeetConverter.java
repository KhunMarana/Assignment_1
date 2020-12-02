package com.khunaungpaing.ass;

public class InchesToFeetConverter {

	public void converter (int input){
		int feet = input/12;
		int inches = input-(feet*12);
		
	
		System.out.println(feet+"\' "+inches+"\"");
	}
}
