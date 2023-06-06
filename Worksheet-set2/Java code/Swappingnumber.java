package com.MyProject.java;

import java.util.Scanner;

public class Swappingnumber {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	int num1= scanner.nextInt();
	
	System.out.println("Enter second number");
	int num2= scanner.nextInt();
	System.out.println("Before swapping: "+ num1+ " and "+ num2);
	
	int temp = num1;
	num1= num2;
	num2= temp;
	
	System.out.println("After swapping: "+ num1+ " and "+ num2);
	
}
}
