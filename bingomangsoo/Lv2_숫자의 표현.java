class Solution {
    public int solution(int n) {
        int cnt = 0;
        int sum = 0;
        
        int s = 1;
        int e = 1;
        
        while (s <= n) {
        	if (sum > n || e==n+1) {
        		sum -= s;
        		s++;
        	} else {
        		sum += e;
        		e++;
        	}
        	
        	if (sum == n) {
        		cnt++;
        	}
        }
        return cnt;
    }
}
