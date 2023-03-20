package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex01 {
	
	/*
		 Ex01 Two Sum

	   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	   You may assume that each input would have exactly one solution, and you may not use the same element twice.
	   You can return the answer in any order.
	 */

	public static void main(String[] args) throws Exception{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input :");
		String input = buff.readLine();
		String[] inputArray = input.split(" ");

		int[] nums = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
		
		buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Target :");
		int target = Integer.parseInt(buff.readLine());
		
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}
	
    public static int[] twoSum(int[] nums, int target) {
        
    	int[] resultArray = new int[2];
//    	int sub = 0;
//    	List<Integer> integerList = new ArrayList<Integer>();
//    	
//    	for (int i = 0; i < nums.length ; i++) {
//    		integerList.add(nums[i]);
//    	}
//    	
//    	for(int i=0; i<nums.length; i++) {
//    		sub = target - nums[i];
//    		
//    		if(integerList.contains(sub) && integerList.lastIndexOf(sub) != i) {
//    			resultArray[0] = i;
//    			resultArray[1] = integerList.lastIndexOf(sub);
//    			
//    			break;
//    		}
//    	}
    	
    	loop:
    	for(int i=0;i<nums.length;i++) {
    		for(int j=1;j<nums.length;j++) {
    			if(nums[i] + nums[j] == target) {
    				resultArray[0] = i;
    				resultArray[1] = j;
    				
    				break loop;
    			}
    		}
    	}
    	
    	return resultArray;
    }

}
