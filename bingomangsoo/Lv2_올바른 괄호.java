import java.util.Stack;
class Solution {
    boolean solution(String s) {
        
        Stack<String> st = new Stack<>();
		
		boolean b = true;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.add(String.valueOf(s.charAt(i)));
			} else {
				if (st.empty()) {
					b = false;
                			break;
				}else {  
				    st.pop();
               			}
			}
		}
		if (!st.empty()) {
			b = false;
		}
        return b;
    }
}
