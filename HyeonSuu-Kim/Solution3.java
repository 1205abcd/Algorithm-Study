class Solution3 {
public long solution(int k, int d) {
        double distance = (double) d / k;
        int y = (int)distance;
        int x = 0;
        long answer = 0;

        for(int start = y; y >= 0;) {
        if (distance >= pointDistance(x, y)) {
        answer += y + 1;
        x++;
        }
        else {
        y--;
        }
        }

        return answer;
        }

private double pointDistance(int x, int y) {
        double distance = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(distance);
        }
        }