package ch10;

import java.util.Scanner;

class Main계단오르기 {
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 2;
		for(int i=2; i<n; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		answer = arr[n-1];


		return answer;
	}
	
	public static void main(String[] args) {
		Main계단오르기 T = new Main계단오르기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}