package com.epam.principles;

import java.util.Scanner;

public class calci1 {
	 public static void main(String[] args) 
	 {
		 int a, b, r;
		 char c;
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.print("First Number : ");
		 a=scan.nextInt();
		 System.out.print("Second Number : ");
		 b=scan.nextInt();
		 System.out.print("Enter (+,-,*,/) : ");
		 c=scan.next().charAt(0);
		 
		 if(c == '+')
		 {
			 r = a + b;
			 System.out.print("Result = " +r);
		 }
		 else if(c == '+')
		 {
			 r = a - b;
			 System.out.print("Result = " +r); 
		 }
		 else if(c == '*')
		 {
			 r = a * b;
			 System.out.print("Result = " +r);
		 }
		 else if(c == '/')
		 {
			 r = a / b;
			 System.out.println("Result = " +r);
		 }
		 else 
		 {
			 System.out.println("Invalid Operator !!!");
		 }
	 
	 scan.close();
	 }


}