package com.MyProject.java;
import java.util.Scanner;

public class PrimeorNot {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter any number: ");
	int num1= scanner.nextInt();
	int temp=0;
	
	for (int i = 2; i <= num1; i++) {
		if(num1%i ==0) {
		temp++;	}}
		
	if(num1==1) {
		System.out.println(num1+ " is not a prime number");}	
	
	if(temp<=1) {
		System.out.println(num1+ " is a prime number");}

		else {
			System.out.println(num1+" is not a prime number");}
	
}
}
