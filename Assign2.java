package com;

public class Assign2 {

		public static void main(String[] args) {
			int num = 1234 ;
			int reversed =0;
			while(num!=0) {
				int dig =num%10;
				reversed = reversed * 10 + dig;
				num/=10;
			}
			System.out.println(reversed);
			}
}
