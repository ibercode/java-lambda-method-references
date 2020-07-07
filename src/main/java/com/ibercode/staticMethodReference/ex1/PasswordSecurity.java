package com.ibercode.staticMethodReference.ex1;

public class PasswordSecurity {

	public static boolean check(String password){
		if(password.length() > 10) {
			return true;
		} else {
			return false;
		}
	}
}
