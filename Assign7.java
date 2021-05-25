package com;
import java.util.Scanner;

public class Assign7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double radius=sc.nextDouble();
	double pi=3.14;
	double a;
	a=pi*(radius*radius);
	System.out.println(a + " m^2");
	sc.close();
	}

}
