class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i < section.length; i++) {
            arr[section[i]] = 1;
        }
        for (int i = 0; i < section.length; i++) {
            if (arr[section[i]]==1){
                for (int j = arr[section[i]]; j < arr[section[i]] + m && j <= arr.length; j++) {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    }
                }
                answer++;
            }

        }
        return answer;
    }
} 