package ch7;

import java.util.Scanner;

class Main합이같은부분집합 {
	static String answer = "NO";
	static int n, total = 0;
	static int[] arr;
	boolean flag = false;
	public void solution(int L, int sum) {
		if(flag) return;
		if(sum>total/2) return;
		if(L==n){
			if((total-sum) == sum) {
				answer="YES";
				flag = true;
			}
		}else{
			solution(L+1, sum+arr[L]);
			solution(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Main합이같은부분집합 T = new Main합이같은부분집합();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
			total += arr[i];
		}
		T.solution(0, 0);
		System.out.print(answer);
	}
}