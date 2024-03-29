package ch5;
import java.util.Scanner;
import java.util.Stack;

class Main인형뽑기_kakao {
	public int solution(int n, int[][] arr, int m, int[] moves) {
		int answer = 0;
		Stack<Integer> st = new Stack<Integer>();
		for(int i =0; i<m; i++) {
			int a = moves[i];
			int j =0;
			while(j<n-1 && arr[j][a-1] == 0) {
				j++;
			}
			if(st.isEmpty() && arr[j][a-1] != 0) st.push(arr[j][a-1]);
			else {
				if(arr[j][a-1] == st.peek()) {
					st.pop();
					answer += 2;
				}else {
					if(arr[j][a-1] != 0) st.push(arr[j][a-1]);
				}
			}
			arr[j][a-1] = 0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main인형뽑기_kakao T = new Main인형뽑기_kakao();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i =0; i<m; i++) {
			moves[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr, m, moves));
	}
}
