package exercises;

import java.util.HashMap;
import java.util.Map;

public class Ex13 {

	/*
		Ex13 Roman to Integer

		Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
		Given a roman numeral, convert it to an integer.
	 */

	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
	}
	
    public static int romanToInt(String s) {
        
    	Map<String,Integer> romanMap = new HashMap<String,Integer>();
    	romanMap.put("I", 1);
    	romanMap.put("IV", 4);
    	romanMap.put("V", 5);
    	romanMap.put("IX", 9);
    	romanMap.put("X", 10);
    	romanMap.put("XL", 40);
    	romanMap.put("L", 50);
    	romanMap.put("XC", 90);
    	romanMap.put("C", 100);
    	romanMap.put("CD", 400);
    	romanMap.put("D", 500);
    	romanMap.put("CM", 900);
    	romanMap.put("M", 1000);
    	
    	String[] stringArray = s.split("");
    	int result = 0;
    	int i = 0;
    	
    	while(i < stringArray.length ) {
    		if(i+1 < stringArray.length && romanMap.containsKey(stringArray[i]+stringArray[i+1])) {
    			result += romanMap.get(stringArray[i]+stringArray[i+1]);
    			i += 2;
    		} else {
    			result += romanMap.get(stringArray[i]);
    			
    			i ++;
    		}
    	}
    	
    	return result;
    	
    }

}
