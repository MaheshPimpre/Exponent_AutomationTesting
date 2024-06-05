package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnagramTest {

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0)
			return new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);

			if (!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(s);
		}

		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		// Input: strs = ["eat","tea","tan","ate","nat","bat"]Output:
		// [["bat"],["nat","tan"],["ate","eat","tea"]]

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = groupAnagrams(strs);

		for (List<String> group : result) {
			System.out.println(group);
		}

	}
}
