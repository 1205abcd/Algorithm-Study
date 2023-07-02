import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
       
        for(String key : map.keySet()){
            answer *= (map.get(key) + 1); // 아무것도 선택하지 않은 경우를 고려해 1을 더해줌
        }
        
        // 아무것도 선택하지 않은 경우의 수 빼주기
        return answer - 1; 
    }
}