import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {		
		
		HashMap<String, Integer> m = new HashMap<>();
		
		m.put("A",0);
		m.put("N",0);
		m.put("C",0);
		m.put("F",0);
		m.put("M",0);
		m.put("J",0);
		m.put("R",0);
		m.put("T",0);
		
		
		for (int i=0; i<choices.length; i++) {
			if (choices[i] < 4) {
				m.put(String.valueOf(survey[i].charAt(0)), m.get(String.valueOf(survey[i].charAt(0)))+Math.abs(choices[i]-4));
				
			}else if (choices[i] > 4) {
				m.put(String.valueOf(survey[i].charAt(1)), m.get(String.valueOf(survey[i].charAt(1)))+Math.abs(choices[i]-4));
			}
		}
		
		System.out.println(m);
		
		String answer = "";
		
		if (m.get("R") >= m.get("T")) answer += "R";
		else answer+="T";

		if (m.get("C") >= m.get("F")) answer += "C";
		else answer+="F";
	

		if (m.get("J") >= m.get("M")) answer += "J";
		else answer+="M";
		
		
		if (m.get("A") >= m.get("N")) answer += "A";
		else answer+="N";
		
        
        return answer;
    }
}