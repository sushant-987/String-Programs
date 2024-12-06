package com.string;
//Upper case program
import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		sc.close();
		String result = input.toUpperCase();
		System.out.println("Uppercase: " + result);

	}

}
