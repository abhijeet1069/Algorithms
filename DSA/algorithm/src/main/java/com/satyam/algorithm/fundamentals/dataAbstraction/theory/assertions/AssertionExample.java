package com.satyam.algorithm.fundamentals.dataAbstraction.theory.assertions;

public class AssertionExample {

	public static void main(String[] args) {
		int value = -1;
		assert value > 0 : "Value must be greater than 0";
		
		System.out.println("Value is "+value);

	}

}
