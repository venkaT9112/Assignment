package com;

import java.util.Scanner;

public class Assign10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		double amount =sc.nextDouble();
		Scanner sv = new Scanner(System.in);
		System.out.println("enter the interest");
		double interest =sv.nextDouble();
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the time");
		double time =ss.nextDouble();
		
		double calc=(amount*interest)/100;
		System.out.println("simple interest amount is " + calc*12*time);
		
		sc.close();
		sv.close();
		ss.close();

	}

}
