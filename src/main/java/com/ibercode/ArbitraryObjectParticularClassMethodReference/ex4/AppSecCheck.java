package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex4;

import java.util.List;

public class AppSecCheck {

	public static void main(String[] args) {
		
		/**
		 * FI SecurityCheck takes as a param
		 * a class that contains a Method that return
		 * the same type as the FI SAM method
		 * 
		 *  Reference to an instance method of
		 *  an arbitrary object 
		 *  of a particular type
		 *  
		 *  
		 */
		
		Credential c1 = new Credential("lksdfc3l309d");
		Credential c2 = new Credential("51365");
		Credential c3 = new Credential("34rfes");
		
		List<Credential> credentials = List.of(c1, c2, c3);
		checkCredentials(credentials, Credential::check);
		

		System.out.println("----------");
		
		SecurityCheck sec = Credential::check;
		verify(c1, sec);

	}


	private static void checkCredentials(List<Credential> credentials, SecurityCheck sec) {

		credentials.stream()
			.forEach(c -> {
				verify(c, sec);
			});
		
	}

	private static void verify(Credential c1, SecurityCheck sec) {
		if(sec.test(c1)) {
			System.out.println("Password is Secure");
		} else {
			System.out.println("Weak Password");
		}
	}
}
