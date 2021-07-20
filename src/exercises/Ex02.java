package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Reverse 할 숫자 입력 :");
		int originalNum = Integer.parseInt(buffer.readLine());
		System.out.println(reverse(originalNum));
	}
	
    
    public static int reverse(int x) {
    	
    	int result = 0;
    	boolean isZero = true;
    	StringBuilder builder = new StringBuilder();
    	
    	// int를 String배열로 변환
    	String[] strArray = Integer.toString(x).split("");
    	
    	for(int i=(strArray.length-1); i>=0; i--) {
    		// 음수인 경우 StringBuilder 맨 앞에 - 추가
    		if(strArray[i].equals("-")){
    			builder.insert(0, strArray[i]);
    			
    		// 32100000 등의 형태를 reverse했을 때 000000이 앞에 붙는 것을 방지
    		} else if(strArray[i].equals("0") && isZero == false) {
    			builder.append(strArray[i]);
    		} else if(strArray[i].equals("0") && isZero == true) {
    			continue;
    		} else {
    			
    		// 정상적인 숫자인 경우 append
    			builder.append(strArray[i]);
    			isZero = false;
    		}
    	}
    	
    	String text = builder.toString();
    	// int로 변환하여 값 return. int의 범위를 벗어난 경우 result = 0
    	try {
    		result = Integer.parseInt(text);
    	} catch(NumberFormatException nfe) {
    		result = 0;
    	}
    	
    	return result;
    }

}
