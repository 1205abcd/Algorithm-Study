import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
class Solution {
    public ArrayList solution(String today, String[] terms, String[] privacies) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
		Date tod = df.parse(today);
		
		
		HashMap<String, Integer> m = new HashMap<>();
		for (int i=0; i<terms.length; i++) {
			String [] str = terms[i].split(" ");
			m.put(str[0], Integer.parseInt(str[1]));
		}

		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for (int i=0; i<privacies.length; i++) {
			String str [] = privacies[i].split(" ");
			Date d = df.parse(str[0]);
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.MONTH, m.get(str[1]));
			cal.add(Calendar.DATE, -1);
			int result = tod.compareTo(new Date(cal.getTimeInMillis()));
			if (result > 0) {
				arr.add(i+1);
			}
		}
        return arr;
    }
}