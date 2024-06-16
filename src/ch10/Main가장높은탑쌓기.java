package ch10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Cuboid implements Comparable<Cuboid>{
	int s, h, w;
	public Cuboid(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Cuboid o) {
		return o.s - this.s;
	}
}

class Main가장높은탑쌓기 {
	public int solution(ArrayList<Cuboid> list) {
		int answer = 0;
		Collections.sort(list);
		int[] dy = new int[list.size()];
		dy[0] = list.get(0).h;
		answer = dy[0];
		for(int i=1; i<dy.length; i++){
			int height = 0;
			for(int j=i-1; j>=0; j--){
				if(list.get(j).w > list.get(i).w && dy[j] > height){
					height = dy[j];
				}
			}
			dy[i] = height+list.get(i).h;
			answer = Math.max(dy[i], answer);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main가장높은탑쌓기 T = new Main가장높은탑쌓기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Cuboid> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			int s = kb.nextInt();
			int h = kb.nextInt();
			int w = kb.nextInt();
			list.add(new Cuboid(s, h, w));
		}
		System.out.println(T.solution(list));
	}
}