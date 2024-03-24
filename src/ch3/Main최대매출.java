package ch3;

import java.util.Scanner;

/**
 * 3. 최대 매출
 * 설명
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 * 12 1511 20 2510 20 19 13 15
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 * 여러분이 현수를 도와주세요.
 * 입력
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 * 출력
 * 첫 줄에 최대 매출액을 출력합니다.
 * 예시 입력 1
 * 10 3
 * 12 15 11 20 25 10 20 19 13 15
 * 예시 출력 1
 * 56
 */
class Main최대매출 {
	public int solution(int n, int d, int[] arr) {
		int sum = 0;
		int answer = 0;

		for(int i=0; i<=n-d;i++) {
			if (sum == 0) {
				for (int j = i; j < i + d; j++) {
					sum += arr[j];
				}
				answer = sum;
			} else {
				sum = sum - arr[i - 1] + arr[i + d-1];
				if(sum > answer) answer = sum;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main최대매출 T = new Main최대매출();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int d = kb.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,d,arr));
	}
}
