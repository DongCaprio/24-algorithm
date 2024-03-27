package ch4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 4. 모든 아나그램 찾기
설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
예시 입력 1 
bacaAacba
abc
예시 출력 1
3
힌트
출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 * @author 82104
 */
class Main모든아나그램찾기 {
	public int solution(String str, String str2) {
		int answer = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(char x : str2.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		Map<Character, Integer> map2 = new HashMap<>();
		char[] arr = str.toCharArray();
		
		for(int i=0; i+str2.length()-1<str.length(); i++) {
			if(i==0) {
				for(int k=i; k<i+str2.length(); k++) {
					map2.put(arr[k], map2.getOrDefault(arr[k], 0)+1);
				}
			}else {
				if(map2.get(arr[i-1]) == 1) {
					map2.remove(arr[i-1]);
				}else {
					map2.put(arr[i-1], map2.get(arr[i-1])-1);
				}
				map2.put(arr[i+str2.length()-1], map2.getOrDefault(arr[i+str2.length()-1],0)+1);
			}
			if(map.equals(map2)) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main모든아나그램찾기 T = new Main모든아나그램찾기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		System.out.println(T.solution(str, str2));
	}
}
