package com.greens.customer;

import java.util.Scanner;

import com.greens.Day1.Employee;

public class Datatypes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// to get input from numeric data

		System.out.println("Enter a  \"String\"");
		// short cut to take return type => ctrl+2 L
		 char charAt = sc.next().charAt(0);
		//String nextLine1 = sc.nextLine();
		//String nextLine2 = sc.nextLine();

		// to concat more than two data types
		System.out.println("Entered the String : " + charAt);

	}

}
