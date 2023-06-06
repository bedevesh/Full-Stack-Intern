package com.MyProject.java;
import java.util.Scanner;

public class LargestOfThree {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int num1= scanner.nextInt();
	
	System.out.println("Enter second number");
	int num2= scanner.nextInt();
	
	System.out.println("Enter second number");
	int num3= scanner.nextInt();
	
	int arr[]= new int [3];
	arr[0]= num1;
	arr[1]= num2;
	arr[2]= num3;
	
	int max = arr[0];
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]> max) {
			max = arr[i];}}
			System.out.println("\n"+max+ " is the largest" );
		
	
	
}
}
