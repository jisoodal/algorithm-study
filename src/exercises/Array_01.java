package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_01 {
	
	/*
	 * 문제  : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	 * 입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
	 * 출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	 */

	public static void main(String[] args) throws Exception{
		
		// Scanner보다 빠른 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String count = br.readLine();
		String numbers = br.readLine();
		
		String resultStr = count+"\n"+numbers;
		
		System.out.println(getMinMaxNum(resultStr));

	}
	
	public static String getMinMaxNum(String pro) {

//		String answer = "";
//		
//		// 개행문자로 split하여 정수의 개수 담기
//		int count = Integer.parseInt(pro.split("\n")[0]);
//		
//		String[] array = pro.split("\n")[1].split(" ");
//		// 입력 받은 String을 빈칸으로 쪼개서 String 배열로 담은 후 int 배열로 변환
//		int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
//		
//		// 오름차순 정렬
//		Arrays.sort(intArray);
//		
//		answer += intArray[0]+" "+intArray[count-1];
//		
//		return answer;
		
		String answer = "";

		// 개행문자로 split하여 정수의 개수 담기
		int count = Integer.parseInt(pro.split("\n")[0]);
		
		String[] array = pro.split("\n")[1].split(" ");
		// 입력 받은 String을 빈칸으로 쪼개서 String 배열로 담은 후 int 배열로 변환
		int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
		
		int minTemp = intArray[0];
		int maxTemp = intArray[0];
		
		for(int i=1;i<count;i++) {
			// 최소
			if(minTemp >= intArray[i]) {
				minTemp = intArray[i];
			}
			
			// 최대
			if(maxTemp <= intArray[i]) {
				maxTemp = intArray[i];
			}
		}
		
		answer += minTemp+" "+maxTemp;
		
		return answer;
	}
}
