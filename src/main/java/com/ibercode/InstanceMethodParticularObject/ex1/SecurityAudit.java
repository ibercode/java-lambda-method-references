package com.ibercode.InstanceMethodParticularObject.ex1;

import java.util.List;

public class SecurityAudit {

	public void checkPasswords(List<String> passwords) {
		
		passwords.stream()
			.forEach(p -> {
				if(p.length() < 10) {
					System.out.println(p + " Weak Password");
				} else {
					System.out.println(p + " Password Secure");
				}
			});
	}
}
