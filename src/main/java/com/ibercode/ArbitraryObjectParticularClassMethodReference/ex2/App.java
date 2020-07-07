package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex2;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		Credentials credentials = new Credentials("lksdfc3l309d");
		
		//Lambda Expression -> FI = LE
		Predicate<Credentials> security1 = c -> c.check();
		security1.test(credentials);
		
		
		//Method Reference -> FI = MR
		Predicate<Credentials> security = Credentials::check;
		
		if(security.test(credentials)) {
			System.out.println("Password is Secure");
		} else {
			System.out.println("Weak Password");
		}
	}
}
