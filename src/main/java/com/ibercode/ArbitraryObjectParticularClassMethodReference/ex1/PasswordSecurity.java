package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex1;

@FunctionalInterface
public interface PasswordSecurity {

	boolean check(Evaluator evaluator, String password);
}
