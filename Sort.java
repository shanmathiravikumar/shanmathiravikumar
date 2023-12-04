package com.shan.arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int[] arr=new int[20];
		System.out.print("Enter the numbers:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println("Enter the terms:");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();	
		}
		
		System.out.println("the elements are");
		for (int i=0;i<n;i++) {
			System.out.print(""+arr[i]+" ");
			System.out.println();
		}
		System.out.println("Ascending order:");
		int temp;
		int i;
		for(i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Descending order:");
		for(i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

		
		
		

	}

}
