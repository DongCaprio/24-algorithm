package ch7;

import java.util.Scanner;

class Main바둑이승차 {
	static int c, n, answer = 0;
	static int [] arr;
	public void solution(int L, int sum) {
		if(sum>c) return;
		if(L==n){
			answer = Math.max(sum, answer);
		}else{
			solution(L+1, sum+arr[L]);
			solution(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Main바둑이승차 T = new Main바둑이승차();
		Scanner kb = new Scanner(System.in);
		c = kb.nextInt();
		n = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = kb.nextInt();
		}
		T.solution(0, 0);
		System.out.println(answer);
	}
}