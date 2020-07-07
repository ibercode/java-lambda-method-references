package com.ibercode.ArbitraryObjectParticularClassMethodReference.ex2;

public class Credentials {

	private String password;

	public Credentials(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean check() {

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
