package com.MyProject.java;
import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter any number: ");
	int num1= scanner.nextInt();
	
	if(num1%2 ==0) {
		System.out.println(num1+ " is a even number.");}
	else {
		System.out.println(num1+ " is a odd number");
	}



}}
