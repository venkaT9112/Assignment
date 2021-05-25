package com;

import java.util.Scanner;

public class Assign13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number :");
		int num =sc.nextInt();
		int square = num*num;
		System.out.println("square root of give number is :" + square);
		sc.close();
	}

}
