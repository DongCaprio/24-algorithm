package ch7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main동전교환 {

	static int n, m, answer = Integer.MAX_VALUE;
	static Integer[] arr;
	public void solution(int L, int sum) {
		if(sum>m) return;
		if(L>=answer) return;
		if(sum == m){
			answer = Math.min(answer, L);
		}else{
			for(int i=0; i<n; i++){
				solution(L+1, sum+arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Main동전교환 T = new Main동전교환();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new Integer[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		m = kb.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());

		T.solution(0,0);
		System.out.println(answer);
	}
}