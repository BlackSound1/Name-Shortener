package ggkgk;

import java.util.Scanner;

/**
 * @author matt
 * @version 1.0
 */
public class NameShortener {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		
		
		System.out.print("Enter your full name: ");
		String name = userIn.nextLine();
		
		System.out.println("The name you entered is: " + name);
		
		System.out.println("Your shortened name is: " + name.charAt(0) + ". " + name.substring(name.indexOf(" ")+ 1));
		
		
		int[] numArray = {1,2,3,4,5,6};
		alternatingSum(numArray);
		
		reverseSame(1234,4321);
		
		userIn.close();

	}
	/**
	 * adds and subtracts the numbers in an array to arrive at a final sum 
	 * @param a an array of ints
	 * @return the alternating sum based on the input 
	 */
	public static int alternatingSum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			if(i == a.length - 1) {
				break;
			}
			if(i % 2 != 0) {
				sum = a[i] - a[i + 1];
				System.out.print(a[i] - a[i + 1]);
			}else {
				sum = a[i] + a[i + 1];
				System.out.print(a[i] + a[i + 1]);
			}
		}
		
		return sum;
	}
	
	/**
	 * checks whether 2 given ints are mirrors of each other by reversing one and 
	 * seeing if the result is the same as the other
	 * @param num1 any int
	 * @param num2 any other int
	 * @return true or false
	 */
	public static boolean reverseSame(int num1, int num2) {
		int reversedNum = 0;
		while(num1 != 0) {
			reversedNum = (reversedNum * 10) + (num1 % 10);
			num1 /= 10;
		}
		
		if(reversedNum == num2) {
			return true;
		}else
			return false;
	}

}


