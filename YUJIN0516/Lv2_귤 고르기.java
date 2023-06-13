import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 귤의 무게를 key, 해당 귤의 수를 value로 받음
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int kg:tangerine){
            if(map.get(kg)==null) map.put(kg,1);
            else map.put(kg,map.get(kg)+1);            
        }
   
        // 귤개수만 저장
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            list.add(map.get(key));
        }
       
        // 오름차순 정렬 후 다시 내림차순으로 정렬
        Collections.sort(list);
        Collections.reverse(list);
        
        for (int i : list) {
            answer++;
            k -= i;
            
            if (k <= 0) { // 더 이상 귤선택 못할 경우
                break;
            }
        }
        
        return answer;
    }
}