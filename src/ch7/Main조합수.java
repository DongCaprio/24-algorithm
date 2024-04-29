package ch7;

import java.util.Scanner;

class Main조합수 {

	static int[][] arr;
	public int solution(int n, int r) {
		if(arr[n][r] !=0) return arr[n][r];
		if(n==r || r==0) return 1;
		else{
			return arr[n][r] = solution(n-1, r-1)+solution(n-1, r);
		}
	}
	
	public static void main(String[] args) {
		Main조합수 T = new Main조합수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		arr = new int[n+1][n+1];
		int r = kb.nextInt();
		System.out.println(T.solution(n, r));
	}
}