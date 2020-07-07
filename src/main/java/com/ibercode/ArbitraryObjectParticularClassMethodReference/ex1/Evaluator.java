package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex1;

public class Evaluator {

	public boolean isPasswordSecure(String password) {
		if(password.length() > 10) {
			return true;
		} else {
			return false;
		}
	}
}
