package cfs;

import java.util.Scanner;

public class signfinder {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		if(num>0) {
			System.out.println("The given number is positive");
		}
		else if(num<0) {
			System.out.println("The given number is negative");
		}
		else {
			System.out.println("The given number is zero");
		}
		
	}

}
