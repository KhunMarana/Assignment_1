package com.khunaungpaing.ass;

public class InchesToFeetConverter {

	public void converter (double input){
		int feet=0;
		double inches = input;
		
		while(inches>=12)
		{
			feet +=1;
			inches-=12;
		}
	
		System.out.println(feet+"\' "+inches+"\"");
	}
}
