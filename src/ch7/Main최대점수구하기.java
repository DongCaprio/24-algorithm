package ch7;

import java.util.Scanner;

class Main최대점수구하기 {

	static int [] ponitArr, timeArr;
	static int n, m, answer =0;

	public void solution(int L, int sum, int tsum) {
		if(tsum > m) return;
		if(L==n){
			answer = Math.max(sum, answer);
		}else{
			solution(L+1, sum+ponitArr[L], tsum+timeArr[L]);
			solution(L+1, sum, tsum);
		}
	}
	
	public static void main(String[] args) {
		Main최대점수구하기 T = new Main최대점수구하기();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		ponitArr = new int[n];
		timeArr = new int[n];
		for(int i=0; i<n; i++){
			ponitArr[i] = kb.nextInt();
			timeArr[i] = kb.nextInt();
		}
		T.solution(0, 0, 0);

		System.out.println(answer);
	}
}