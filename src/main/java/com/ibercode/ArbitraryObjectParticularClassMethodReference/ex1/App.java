package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex1;

public class App {

	public static void main(String[] args) {
		
		String password = "1234";
		
		Evaluator evaluator = new Evaluator();

		//Lambda Expression -> FI = LE
		PasswordSecurity ps = (e,p) -> e.isPasswordSecure(p);
		ps.check(evaluator, password);
		
		//Method Reference -> FI = MR
		PasswordSecurity security = Evaluator::isPasswordSecure;
		
		if(security.check(evaluator, password)) {
			System.out.println("Password Secure");
		} else {
			System.out.println("Weak Password");
		}
		
	}
}
