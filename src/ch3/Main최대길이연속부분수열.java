package ch3;
import java.util.Scanner;
/**
 * 6. 최대 길이 연속부분수열
설명
0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
1 1 0 0 1 1 0 1 1 0 1 1 0 1
여러분이 만들 수 있는 1이 연속된 연속부분수열은
https://cote.inflearn.com/public/upload/19123bb35c.jpg
이며 그 길이는 8입니다.
입력
첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
출력
첫 줄에 최대 길이를 출력하세요.
예시 입력 1 
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1
예시 출력 1
8
 * @author 82104
 *
 */
class Main최대길이연속부분수열 {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int kk = k, p=0, count = 0;
		
		for(int i =0; i<n; i++) {
			p = i;
			count=0;
			while((kk>=0 && p<n) && !(kk==0&&arr[p]==0) ) {
				if(arr[p++] == 1) {
				}else {
					kk--;
				}
				count++;
			}
			kk=k;
			answer = Math.max(count, answer);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main최대길이연속부분수열 T = new Main최대길이연속부분수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
	}
}
