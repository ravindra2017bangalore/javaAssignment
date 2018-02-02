package com.csipl.assign.day7.interruptex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 
 * Q6. Nested Try-Catch.....
 */
public class NestedTryCatch {
	public static void main(String[] args) {
		System.out.println("\t\t\t===Nested Try-Catch Example===");
		try {
			/*
			 * if exception is raised in this statement than exception is handled by 
			 * the catch block(FileNotFoundException && ArrayIndexOutOfBoundException)  
			 */
			FileInputStream fis = new FileInputStream(new File(args[0]));
			int res=0;
			int num=2;
			try
			{
			res=num/0;
			System.out.println("The Result is : "+res);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException Handled...");
			}
		} catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {

			System.out.println("FileNotFoundException are Handled && ArrayIndexOutBoudsExceptionHere");
		}
	}
}
