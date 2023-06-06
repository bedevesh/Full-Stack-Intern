package com.MyProject.java;
import java.util.Scanner;

public class VowelConsonant {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any letter: ");
	char c = scanner.next().charAt(0);
	
	if(c== 'a'|| c=='e'|| c== 'i'||c== 'o'|| c=='u') {
		System.out.println(c +" is a vowel.");
	}else {
		System.out.println(c+ " is a consonant.");
	}
	
}
}
