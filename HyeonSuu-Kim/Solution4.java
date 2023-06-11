class Solution4 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[] {0, sequence.length - 1};

        // find the shortest subsequence that the sum == k
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < sequence.length) {
            sum += sequence[right];
            while (sum > k) {
                sum -= sequence[left];
                left++;
            }
            if (sum == k) {
                if (right - left < answer[1] - answer[0]) {
                    answer[0] = left;
                    answer[1] = right;
                }
            }
            right++;
        }

        return answer;
    }
}