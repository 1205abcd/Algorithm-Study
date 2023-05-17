import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[] ingredient) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.stream(ingredient).boxed().collect(Collectors.toList()));

		
		int cnt = 0;
		for (int i=3; i<l.size(); i++) {
			if (i > 2 && l.get(i)==1 &&l.get(i-1)==3 &&l.get(i-2)==2 &&l.get(i-3)==1) {
				cnt++;
				l.remove(i);
				l.remove(i-1);
				l.remove(i-2);
				l.remove(i-3);
				i-=4;
			}
		}
        return cnt;
    }
}