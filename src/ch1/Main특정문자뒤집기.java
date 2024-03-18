package ch1;

import java.util.Scanner;

class Main특정문자뒤집기 {
	/**
	 *	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
	 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
	 */
	public String solution(String str) {
		String answer = "";

		char[] arr = str.toCharArray();
		for(int i=0; i<(arr.length/2); i++){
			if(Character.isAlphabetic(arr[i]) && Character.isAlphabetic(arr[arr.length-1-i])){
				char x = arr[i];
				arr[i] = arr[arr.length-1-i];
				arr[arr.length-1-i] = x;
			}
		}
		answer = String.valueOf(arr);
		return answer;
	}
	
	public static void main(String[] args) {
		Main특정문자뒤집기 T = new Main특정문자뒤집기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
