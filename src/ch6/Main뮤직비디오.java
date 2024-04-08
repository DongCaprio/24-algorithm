package ch6;

import java.util.Arrays;
import java.util.Scanner;

class Main뮤직비디오 {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			int sum=0, count = 1;
			for(int x : arr) {
				if(sum+x>mid) {
					count++;
					sum=x;
				}else {
					sum += x;
				}
			}
			
			if(count <= m) {
				answer = mid;
				rt = mid-1;
			}else {
				lt = mid+1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main뮤직비디오 T = new Main뮤직비디오();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();

		System.out.println(T.solution(n,m,arr));
	}
}
