package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex03 {
	
	/*
	 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
	 */

	public static void main(String[] args) throws Exception{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input :");
		int input = Integer.parseInt(buff.readLine());
		
		System.out.println(isPalindrome(input));
	}
	
    public static boolean isPalindrome(int x) {
    	// 빠른 답안
        if(x<0 || (x!=0 && x%10==0))
            return false;
            int res = 0;
               while(x>res){
                res = res*10 + x%10;
                x = x/10;
               }
            return (x==res || x==res/10);
    	/*
    	String[] inputArray = Integer.toString(x).split("");
    	String result = "";
    	
    	// 일단 스택에 담고 거꾸로 뽑았을 때 값이 일치하는지를 보자
    	Stack<String> pStack = new Stack<String>();
    	int pStackSize = 0;
    	
    	for(String input : inputArray) {
    		pStack.push(input);
    	}
    	
    	pStackSize = pStack.size();
    	
    	for(int i=0; i<pStackSize; i++) {
    		result += pStack.pop();
    	}
    	
    	if(result.equals(Integer.toString(x))) {
    		return true;
    	}
    	
    	return false;
    	*/
    }

}
