package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnMap {

	public static void main(String[] args) {

		Map<String, Integer> employeeMap = new HashMap<>();
		employeeMap.put("Mahesh", 50000);
		employeeMap.put("Pimpre", 54000);
		employeeMap.put("Mahi", 20000);
		employeeMap.put("Mahendra", 10000);

		List<String>list=employeeMap.entrySet(
				).stream()
				.filter(v->v.getValue()>20000)
				.map(k->k.getKey())
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
