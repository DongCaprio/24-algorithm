package ch4;

import java.util.*;

class Main {
	public int solution(String s, String t) {
		int answer = 0;

		int n = t.length();
		for(int i =0; i<=s.length()-n;i++){
			String str = s.substring(i,i+n);
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			str = new String(chars);

			System.out.println(str);
		}







		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.println(T.solution(s, t));
	}
}
