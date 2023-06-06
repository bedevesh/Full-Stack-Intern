package com.MyProject.java;
import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num1= scanner.nextInt();
	
		
		for (int i = 1; i <= 10; i++) { // change limit here
			 int ans= num1*i;
			System.out.println(num1+" * "+ i+" = " +ans);
			
		}
	
	}
}
