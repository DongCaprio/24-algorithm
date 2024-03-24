package ch3;

import java.util.ArrayList;
import java.util.Scanner;

class Main두배열합치기 {
	public String solution(int n, int m, int[] a, int[] b) {
		String answer = "";
		ArrayList<Integer> list = new ArrayList<>();
		int p1=0,p2=0;

		while(p1<n && p2<m){
			if(a[p1]<b[p2]){
				list.add(a[p1++]);
			}else{
				list.add(b[p2++]);
			}
		}
		while(p1<n) list.add(a[p1++]);
		while(p2<m) list.add(b[p2++]);

		for(int i : list){
			System.out.print(i+" ");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main두배열합치기 T = new Main두배열합치기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = kb.nextInt();
		}
		int n2 = kb.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++){
			arr2[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, n2,arr, arr2));
	}
}
