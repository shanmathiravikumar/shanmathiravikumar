package com.shan.arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n0=0;
		int n1=1;
		int n2;
		int n;
		System.out.println("Enter the term:");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		System.out.print(n0+" "+n1);
		for(int i=2;i<n;i++) {
			n2 = n1 + n0;
			n0=n1;
			n1=n2;
			System.out.print(" "+n2+" ");
		}
	}
}

//FIBONACCI SEQUENCE WITHOUT RECURSION