package ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{

	int start, end;

	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Time o) {
		if(this.end == o.end) return this.start - o.start;
		return this.end - o.end;
	}
}

class Main회의시배정 {
	public int solution(ArrayList<Time> list, int n) {
		int answer = 0;
		Collections.sort(list);
		int start =-1, end =-1;

		for(int i=0; i<list.size(); i++){
			if(list.get(i).start > start && list.get(i).start >= end){
				start = list.get(i).start;
				end = list.get(i).end;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main회의시배정 T = new Main회의시배정();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int start = kb.nextInt();
			int end = kb.nextInt();
			list.add(new Time(start, end));
		}
		System.out.println(T.solution(list, n));
	}
}