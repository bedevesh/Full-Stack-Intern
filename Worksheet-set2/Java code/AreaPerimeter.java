package com.MyProject.java;

import java.util.Scanner;

public class AreaPerimeter {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter length: ");
	int num1= scanner.nextInt();
	
	System.out.println("Enter breadth: ");
	int num2= scanner.nextInt();
	
	System.out.println("Area: "+ (num1*num2));
	
	System.out.println("Perimeter :"+ 2*(num1+num2));
	
}
}
