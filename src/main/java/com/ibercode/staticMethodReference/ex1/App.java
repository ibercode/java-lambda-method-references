package com.ibercode.staticMethodReference.ex1;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		//FI = Lambda Expression
		Predicate<String> ps1 = s -> PasswordSecurity.check(s);
		System.out.println("Is Passwors Secure? " + ps1.test("lksdjoaid8asda"));
		
		//FI = Method Reference (static)
		Predicate<String> ps = PasswordSecurity::check;
		System.out.println("Is Passwors Secure? " + ps.test("1234"));
	}
}
