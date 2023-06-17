import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
		
		for(int i = 0; i < citations.length; i++) {
			int h = citations.length - i; // 남은 논문의 수
			
			if(citations[i] >= h) { // 인용 횟수가 남은 논문의 수보다 크거나 같으면
				answer = h;
				break;
			}
		}
        
        return answer;
    }
}