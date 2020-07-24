package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex5;

import java.util.function.Predicate;

public class AppPassMR {

	public static void main(String[] args) {
		
		Password p1 = new Password("1234");
		
		Predicate<Password> pp = Password::testStrength;
		
		pp.test(p1);
		
		/**
		 * FI Security SAM takes a Password and return boolean
		 * 
		 * Password Class has a method that returns boolean
		 * 
		 * Reference to an instance method(testStrenght) of
		 * an arbitrary object(p2) of a particular type(Password)
		 * i.e. 	ContainingType::methodName
		 */
		
		Password p2 = new Password("1234asdfd456789");
		Security security = Password::testStrength;
		testPassword(p2, security);
		
		security.check(p2);
	}

	private static void testPassword(Password password, Security security) {
		if(security.check(password)) {
			System.out.println("Password Secure");
		} else {
			System.out.println("Weak Password");
		}
	}
}
