package com;

public class Vote {

	public boolean canIVote(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
