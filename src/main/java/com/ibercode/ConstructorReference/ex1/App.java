package com.ibercode.ConstructorReference.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class App {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		//FI = Lambda Expression
		BiFunction<String, Integer, Employee> ul1 = (n,a) -> new Employee(n, a);
		
		//FI = Constructor Reference
		BiFunction<String, Integer, Employee> ul = Employee::new;
		
		Map<String, Integer> data = new HashMap<>();
		data.put("Mark", 28);
		data.put("Alice", 19);
		data.put("Monica", 31);
		data.put("Tom", 23);
		
		data.forEach((k,v) ->  {
			employees.add(ul.apply(k, v));
		});

		employees.forEach(System.out::println);
	}
}
