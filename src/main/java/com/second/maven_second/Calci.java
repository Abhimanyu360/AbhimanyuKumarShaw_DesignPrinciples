package com.second.maven_second;
import java.util.*;

public class Calci
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.print("Enter an operator (+, -, *, /) : ");
        char operator = sc.next().charAt(0);
		Calculator obj = new Calculator(first,second,operator);
		obj.calculate();
		sc.close();
	}
}