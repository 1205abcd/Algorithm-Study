class Solution {
    public String solution(String s) {
       		
		String [] arr = s.split(" ");
		
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 1) {
				String sub1 = arr[i].substring(0, 1).toUpperCase();
				String sub2 = arr[i].substring(1).toLowerCase();
				arr[i] = sub1 + sub2;
			} else {
				arr[i] = arr[i].toUpperCase();
			}
			result += arr[i];
            if (i != arr.length-1) {
				result+=" ";
			}
		}
        if (s.charAt(s.length()-1) == ' ') {
			result+=" ";
		}
        return result;
    }
}