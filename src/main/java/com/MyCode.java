package com;

/**
 *  How to run code:
 *  mvn org.pitest:pitest-maven:mutationCoverage
 *  
 * @author Sheetal_Singh
 *
 */
public class MyCode {

	
	public int addition(int a, int b) {
		return a+b;
	}
	
	
	public boolean canIVote(int age) {
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
