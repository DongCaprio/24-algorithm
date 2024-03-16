package ch1;

import java.util.Scanner;

class Main대소문자변환 {
	public String solution(String str) {
		String answer = "";

		char[] arr = str.toCharArray();
		for(char x : arr){
			if(Character.isUpperCase(x)){
				answer += Character.toLowerCase(x);
			} else{
				answer += Character.toUpperCase(x);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main대소문자변환 T = new Main대소문자변환();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
