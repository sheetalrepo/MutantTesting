package com;

/**
 * How to run code: mvn org.pitest:pitest-maven:mutationCoverage
 * 
 * @author Sheetal_Singh
 *
 */
public class Drive {

	public boolean canIDrive(int age, boolean drivingTest) {
		if (age >= 18) {

			if (drivingTest == true) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

}
