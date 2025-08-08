//package com.example.project;
import java.util.Scanner;

class Calculator {
	double a, b;
	String operation;
	
	Calculator(double a, double b, String operation){
		this.a = a;
		this.b = b;
		this.operation = operation;
	}
	
	public void mathOperation() {
		switch(operation.toLowerCase()) {
		case "addition":
			System.out.println("Result: " + (a+b));
			break;
			
		case "subtraction":
			System.out.println("Result: " + (a-b));
			break;
			
		case "multiplication":
			System.out.println("Result: " + (a*b));
			break;
			
		case "division":
			if(b!=0) {
				System.out.println("Result: " + (a/b));
			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
			
		default:
			System.out.println("Invalid operation. Please use addition,subtraction,multiplication or division ");
		}
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter operatoin (addition,subtraction,multiplication or division): ");
		String operation = sc.next();
		
		System.out.print("Enter first number(a): ");
		double a = sc.nextDouble();
 		
		System.out.print("Enter second number(b): ");
		double b = sc.nextDouble();
 		
		Calculator cal = new Calculator(a,b,operation);
		
		cal.mathOperation();
	}

}

