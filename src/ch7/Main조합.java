package ch7;

import java.util.Scanner;

/**
 * 조합 구하기
 * 1부터 N까지 번호가 적힌 구슬이 있습니다.
 * 이 중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하시오
 *
 * 입력설명
 * 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
 *
 * 출력설명
 * 오름차순으로 출력합니다.
 *
 * 입력 예제
 * 4 2
 * 출력 예제
 * 1 2
 * 1 3
 * 1 4
 * 2 3
 * 2 4
 * 3 4
 */
class Main조합 {
	static int[] combi;
	static int n, r; //nCr 에서
	public void DFS(int L, int s) {
		//L은 level , s는 start 번호
		if(L == r){
			for(int x : combi) System.out.print(x+" ");
			System.out.println();
		}else{
			for(int i=s; i<=n; i++){
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main조합 T = new Main조합();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		r = kb.nextInt();
		combi = new int[r];
		T.DFS(0,1);
	}
}