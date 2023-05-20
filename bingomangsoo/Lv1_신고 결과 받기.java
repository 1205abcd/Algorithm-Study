import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        		
		int [] sum = new int[id_list.length];
		int [] result = new int[id_list.length];
		
		
		HashSet<String> r = new HashSet<>(Arrays.asList(report));
		ArrayList<String> report2 = new ArrayList<>(r);
		
		HashMap<String, Integer> m = new HashMap<>();
		for (int i=0; i<id_list.length; i++) {
			m.put(id_list[i],i);
		}
		
		for (int i=0; i<report2.size(); i++) {
			String [] str = report2.get(i).split(" ");
			sum[m.get(str[1])]++;
		}
		
		for (int i=0; i<report2.size(); i++) {
			String [] str = report2.get(i).split(" ");
			if (sum[m.get(str[1])] >=k) {
				result[m.get(str[0])]++;
			}
		}
        
        return result;
    }
}