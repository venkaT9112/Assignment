package com;

import java.util.Scanner;

public class Assign11 {

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
		int a=1;
		while(a<=time)
		{
		double calc=((amount*interest)/100)*12;
        amount =amount+calc;
        System.out.println(amount);
        a++;
        
		}
		sc.close();
		sv.close();
		ss.close();

	}

}
