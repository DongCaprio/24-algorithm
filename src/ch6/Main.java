package ch6;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public String solution(int n, int[][] arr) {
		String answer = "";
		Arrays.sort(arr, (o1,o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]));
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = kb.nextInt();
			}
		}		
		System.out.println(T.solution(n, arr));
	}
}
