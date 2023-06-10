class Solution {
    public int[] solution(int[] sequence, int k) {
        int result [] = new int[2];
		
		int l = sequence.length;
		int s = 0;
		int e = 0;
		
		
		int sum = 0;
		int n = sequence.length;
		
		while (s < l) {
            //시작점부터 끝점까지의 합sum이 k를 넘어가거나 끝점이 sequence를 넘어가면 sum에 시작점의 값을 빼주고, 시작점을 한 칸 이동시킨다.
			if (sum > k || e==l) {
				sum -= sequence[s];
				s++;
			}else {
                //시작점부터 끝점까지의 합이 k보다 작으면 끝점을 한칸씩 이동시키면서 더해준다.
				sum += sequence[e];
				e++;
			}
			
			if (sum == k) {
                //시작점부터 끝점까지의 합sum이 k와 같다면 시작점과 끝점이 길이가 최솟값인지 확인하고 결과 배열에 넣어준다.
				if (e-1 - s < n) {
					n = e-1-s;
					result[0] = s;
					result[1] = e-1;
				}
			}
		}
        return result;
    }
}