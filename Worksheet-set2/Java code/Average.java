package com.MyProject.java;
import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	int num1= scanner.nextInt();
	
	System.out.println("Enter second number");
	int num2= scanner.nextInt();
	
	int average = (num1+ num2)/2;
	
	System.out.println("Average: "+ average);
}
}
