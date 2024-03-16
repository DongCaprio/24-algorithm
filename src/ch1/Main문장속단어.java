package ch1;

import java.util.Scanner;

class Main문장속단어 {
	public String solution(String str) {
		String answer = "";

		int size = 0;

		String[] arr = str.split(" ");
		for(String x : arr){
			if(size < x.length()){
				size = x.length();
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main문장속단어 T = new Main문장속단어();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
