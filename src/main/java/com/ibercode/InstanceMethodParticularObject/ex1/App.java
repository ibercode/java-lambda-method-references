package com.ibercode.InstanceMethodParticularObject.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		
		List<String> passwords = new ArrayList<>(Arrays.asList(
				"asde",
				"12345",
				"smdf98fowifn232",
				"dsa983iedsd988",
				"8544"
				));
		
		SecurityAudit sa = new SecurityAudit();
		
		//FI = Lambda Expression
		Consumer<List<String>> cp1 = ps -> sa.checkPasswords(ps);
		cp1.accept(passwords);
		
		
		//FI = Method Reference
		Consumer<List<String>> cp = sa::checkPasswords;
		
		cp.accept(passwords);
		
	}
}
