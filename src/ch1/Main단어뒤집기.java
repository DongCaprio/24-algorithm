package ch1;

import java.util.Scanner;

class Main단어뒤집기 {
	public String solution(int i, String[] arr) {
		String answer = "";
		for(int a =0; a<i; a++){
			StringBuffer sb = new StringBuffer(arr[a]);
			String reversedStr = sb.reverse().toString();
			System.out.println(reversedStr);
		}

		return answer;
	}
	
	public static <Stirng> void main(String[] args) {
		Main단어뒤집기 T = new Main단어뒤집기();
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		String[] arr = new String[i];
		for(int a =0; a<i; a++){
			arr[a] = kb.next();
		}
		T.solution(i, arr);
	}
}
