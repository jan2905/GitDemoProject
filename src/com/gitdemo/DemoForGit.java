package com.gitdemo;
import java.util.Scanner;

public class DemoForGit {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum=0,temp;
		//Accessing single digit
		while(num!=0) {
				temp = num % 10;
				sum +=(temp*temp*temp);
				num = num/10;
				}
		System.out.println(sum);
				
			}
		


	}


