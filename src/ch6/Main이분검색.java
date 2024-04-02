package ch6;

import java.util.Arrays;
import java.util.Scanner;

class Main이분검색 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int mid = (arr.length-1)/2;
		int lt =0 ,rt=arr.length-1;
		while(arr[mid]!=m){
			if(arr[mid] < m) lt = mid+1;
			else rt = mid-1;
			mid = (lt+rt)/2;
		}
		answer = mid+1;
		return answer;
	}
	
	public static void main(String[] args) {
		Main이분검색 T = new Main이분검색();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = kb.nextInt();
		System.out.println(T.solution(n,m,arr));
	}
}
