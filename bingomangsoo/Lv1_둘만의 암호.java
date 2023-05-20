class Solution {
    public String solution(String s, String skip, int index) {
        String result = "";

		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i);
			for (int j = 0; j < index; j++) {
				
				if (a+1 > 122) {
					a = 96;
				}
				
				if (skip.contains(String.valueOf((char)(a+1)))) {
					j--;
					a++;
				}else {
					a++;
				}
			}
			result +=(char)a;
		}
        
        return result;
    }
}