// Package is a container which keeps sub packages, class and interfaces
// Two types 01) Built in 02) User created

import java.util.Scanner;	// Scanner is sub package in package java
//java.lang classes are available bydefault
import java.lang.*;		//* mean all the packages in lang

class mainC
{
	public static void main(String args[])
	{
		int number;

		Scanner x = new Scanner(System.in);
		System.out.println("Insert Number");
		number = x.nextInt();
		System.out.println("Value is "+ number);
		System.out.println("Random Number : "+ Math.random());
	}
}
