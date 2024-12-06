package com.string;

//String Reverse program
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input = sc.nextLine();
		String reversed = "";
		sc.close();

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println("String Reversed: " + reversed);
	}

}
