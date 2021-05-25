package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Facebook {
	
	public static void create_account()throws Exception
	{
	   	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   	System.out.println("Name");
		String b1=br.readLine();
		System.out.println(b1);
		
		
		System.out.println("mobile num");
		String b2=br.readLine();
		int c2=Integer.parseInt(b2);
		System.out.println(c2);
		
		System.out.println("facebook id");
		String b3=br.readLine();
		System.out.println(b3);
		
	}
	
	public static void edit_account()throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   	System.out.println("Edit Name");
		String b1=br.readLine();
		System.out.println(b1);
		
		
		System.out.println("Edit mobile num");
		String b2=br.readLine();
		int c2=Integer.parseInt(b2);
		System.out.println(c2);
		
		System.out.println("Edit facebook id");
		String b3=br.readLine();
		System.out.println(b3);
	}

	public static void main(String[] args)throws Exception
	{
	 	System.out.println("press 1 to create account");
	 	System.out.println("press 2 to edit account");
	 	System.out.println("Enter your choice");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String b=br.readLine();
		int c=Integer.parseInt(b);
		switch(c) {
		case 1:create_account();
		break;
		case 2:edit_account();
		break;
		default:
			System.out.println("error");
			break;
		}

	}

}
