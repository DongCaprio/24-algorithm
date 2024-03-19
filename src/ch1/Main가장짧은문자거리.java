package ch1;

import java.util.Scanner;

/**
 * 10. 가장 짧은 문자거리
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 예시 입력 1
 * teachermode e
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */
class Main가장짧은문자거리 {
	public String solution(String str,char c) {
		String answer = "";
		int[] intArray = new int[str.length()];
		int p = 1000;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == c){
				p = 0;
				intArray[i] = p;
			}else{
				p++;
				intArray[i] = p;
			}
		}
		p=1000;
		for(int i =str.length()-1; i>=0;i--){
			if(str.charAt(i) == c) p=0;
			else{
				p++;
				intArray[i] = Math.min(intArray[i],p);
			}
		}
		for(int i : intArray){
			System.out.print(i+" ");
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main가장짧은문자거리 T = new Main가장짧은문자거리();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		T.solution(str,c);
	}
}
