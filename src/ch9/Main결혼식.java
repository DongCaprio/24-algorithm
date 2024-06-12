package ch9;

import java.util.ArrayList;
import java.util.Scanner;

class ComeOut{
	int come, out ;
	public ComeOut(int come, int out) {
		this.come = come;
		this.out = out;
	}
}
class Main결혼식 {
	public int solution(ArrayList<ComeOut> list) {
		int answer = 0;
		int[] arr = new int[73];
		for(ComeOut o : list){
			for(int i=o.come; i<o.out; i++){
				arr[i] += 1;
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i] > answer) answer = arr[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main결혼식 T = new Main결혼식();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<ComeOut> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			int come = kb.nextInt();
			int out = kb.nextInt();
			list.add(new ComeOut(come,out));
		}
		System.out.println(T.solution(list));
	}
}