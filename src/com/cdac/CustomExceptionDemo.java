package com.cdac;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		
		try {
			int age =16;
			if (age<18) {
				throw new CustomException("Youre under the age of 18!!");
			} else {
				System.out.println("You are eligible");
			}
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
