package com.epam.principles2;

public class Months {

	public void weekday(int day) {
		if ((day < 1) || (day > 12)) 
			System.out.println("Enter months");
		else {
		String[] days = {
		"jan",
		"feb",
		"march",
		"april",
		"may",
		"june",
		"july",
		"aug",
		"sep",
		"oct",
		"nov",
		"dec"
		};
		System.out.println(days[day-1]);
		}
		
		
	}
}
class kiss{
	public static void main(String[] args) {
		Months obj=new Months();
		obj.weekday(4);
		
	}
}
