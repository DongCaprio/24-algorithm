package ch1;

import java.util.Scanner;

class Main문자찾기 {
	public int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);

		char[] charArr = str.toCharArray();
		for(char c2 : charArr){
			if(c2 == c) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main문자찾기 T = new Main문자찾기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, c));
	}
}
