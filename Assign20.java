package com;
import static java.lang.Float.sum; 
import java.util.Scanner;

public class Assign20 {
	
	public static void display()
	{
		 int count = 1; 
		 float sumF=0;
	      Scanner sc = new Scanner(System.in);     
	      System.out.println("Enter the value of n");  
	      int n = sc.nextInt();  
	      while (count <= n)   
	             {   
	                  System.out.println("Enter the "+count+" number?");  
	                 float xF = sc.nextInt();  
	                 sumF += xF;   
	                  ++count;   
	             }   
	                float averageF = sumF/n;   
	        System.out.println("The Average is"+averageF);
	        sc.close();
		
	}
	
	public static void main(String[] args) 
	{
		display();

	}

}
