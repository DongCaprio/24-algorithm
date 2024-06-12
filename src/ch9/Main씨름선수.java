package ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{

	public int h, w;
	public Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h - this.h;
	}
}

class Main씨름선수 {
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max = 0;
		for(Body obj : arr){
			if(obj.w > max){
				max = obj.w;
				cnt++;
			}
		}

		return cnt;
	}
	
	public static void main(String[] args) {
		Main씨름선수 T = new Main씨름선수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			int h = kb.nextInt();
			int w = kb.nextInt();
			list.add(new Body(h, w));
		}
		System.out.println(T.solution(list, n));
	}
}