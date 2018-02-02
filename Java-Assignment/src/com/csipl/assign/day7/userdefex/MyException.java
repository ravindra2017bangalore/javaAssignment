package com.csipl.assign.day7.userdefex;
/*
 * 
 * here we create MyException class through extending Exception
 */
public class MyException extends Exception {
	private String name = " ";

	public MyException() {

	}

	MyException(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "MyException : Name isn’t matching";
	}
}
