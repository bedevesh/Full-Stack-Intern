package com.MyProject.java;
import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {

try {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter principal amount: ");
	int num1= scanner.nextInt();
	
	System.out.println("Enter interest rate");
	float num2= scanner.nextFloat();
	
	System.out.println("For how much time (number only): ");
	short num3= scanner.nextShort();
	
	float simpleInterest = (num1*num2*num3)/100;
	
	System.out.println("\nSimple interest for "+ num1+" amount "+"with interest rate of " +num2+ " for "+ num3+" years " + "will be "+simpleInterest);
	
}
catch (Exception e) {
	System.out.println("\nInvalid input");
}
	
}
}
