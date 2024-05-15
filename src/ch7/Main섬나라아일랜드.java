package ch7;

import java.util.Scanner;

class Main섬나라아일랜드 {

	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};

	static int[][] board;
	static int n, answer = 0;

	public void BFS(int x, int y) {
		for(int i=0; i<dx.length; i++){
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && ny>=0 && nx<n && ny<n && board[nx][ny] == 1){
				board[nx][ny] = 0;
				BFS(nx, ny);
			}
		}
	}

	public void solution(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(board[i][j] == 1){
					answer++;
					board[i][j] = 0;
					BFS(i, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main섬나라아일랜드 T = new Main섬나라아일랜드();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		board = new int[n][n];

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j] = kb.nextInt();
			}
		}
		T.solution();
		System.out.println(answer);
	}
}