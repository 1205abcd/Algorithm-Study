import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
       	int [] arr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		
		String result = arr[0] + " " + arr[arr.length-1];
        
        return result;
        
    }
}