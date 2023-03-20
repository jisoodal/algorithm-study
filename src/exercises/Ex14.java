package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex14 {
	
	/*
		 Ex14 Longest Common Prefix

		 Write a function to find the longest common prefix string amongst an array of strings.
		 If there is no common prefix, return an empty string "".
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Input :");
		String[] inputArray = reader.readLine().split(",");
		System.out.println("Output: " + longestCommonPrefix(inputArray));
	}

	public static String longestCommonPrefix(String[] strs) {
		/**
		 * 일단 앞에 두 단어 비교해서 결과 도출하고,
		 * 그 단어가 다음 단어에 포함되는지 확인하면 되지않을까..?
		 */

		String prefix = "";

		if(strs.length == 0) return "";
		if(strs.length == 1) return strs[0];

		for (int j = 0 ; j < strs[0].length() ; j ++ ) {
			if(strs[1].length() > j && strs[0].charAt(j) == strs[1].charAt(j)) {
				prefix += strs[0].charAt(j);
			} else {
				break;
			}
		}

		for(int i = 2 ; i < strs.length ; i++) {
			if(strs[i].length() == 0) return "";

			for(int k = 0 ; k < strs[i].length() ; k++) {
				if(strs[i].length() > k && prefix.length() > k) {
					if (strs[i].charAt(0) != prefix.charAt(0)) return "";

					else if(strs[i].charAt(k) == prefix.charAt(k)) {
						continue;
					}

					else {
						prefix = prefix.substring(0, k);
						break;
					}
				}
			}

			if(strs[i].length() <= prefix.length()) {
				prefix = prefix.substring(0, strs[i].length());
			}
		}

		return prefix;
	}

	/*
		베스트 답
	 */
	public String longestCommonPrefixBest(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		int c = 0;
		while(c < first.length())
		{
			if (first.charAt(c) == last.charAt(c))
				c++;
			else
				break;
		}
		return c == 0 ? "" : first.substring(0, c);
	}
}
