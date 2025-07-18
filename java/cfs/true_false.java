package cfs;

import java.util.*;
public class true_false {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if((num1 % 10) == (num2 % 10))	
			System.out.println("True");
		else
			System.out.print("False");
		
		
	}

}
