package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex5;

public class Password {

	private String password;

	public Password(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean testStrength() {

		if (password.length() > 10) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}
}
