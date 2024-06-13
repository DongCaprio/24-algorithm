package ch9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	int money, day;

	public Lecture(int money, int day) {
		this.money = money;
		this.day = day;
	}


	@Override
	public int compareTo(Lecture o) {
		if(this.day == o.day) return o.money - this.money;
		return o.day - this.day;
	}
}
class Main {

	static int n, max = 0;
	public int solution(ArrayList<Lecture> list) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(list);
		int j=0;
		for(int i=max; i>=1; i--){ //i는 day의 최댓값
			for(; j<n; j++){
				if(list.get(j).day<i) break;
				pQ.offer(list.get(j).money);
			}
			if(!pQ.isEmpty()) answer+=pQ.poll();
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			int money = kb.nextInt();
			int day = kb.nextInt();
			list.add(new Lecture(money,day));
			if(day > max) max = day;
		}
		System.out.println(T.solution(list));
	}
}