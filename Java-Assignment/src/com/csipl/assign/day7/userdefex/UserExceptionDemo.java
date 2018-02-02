package com.csipl.assign.day7.userdefex;

import java.util.Scanner;
/*
 * 
 * Q7. UserDefineException Demo...
 */
public class UserExceptionDemo {
	public static void main(String[] args) {
		System.out.println("\t\t\t===UserDefineException===");
		String tempName = " ";
		/*
		 * in this try block we take input through console and 
		 * check the value and throw appropriate Exception 
		 */
		try {
			String name = "nacre";
			System.out.println("enter name");
			tempName = new Scanner(System.in).next();
			if (name.equals(tempName))
				System.out.println("WELCOME TO NACRE");
			else
				throw new MyException("Hi : " + tempName);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}
