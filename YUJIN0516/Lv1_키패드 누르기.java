class Solution {
    public String solution(int[] numbers, String hand) {
        	StringBuilder sb = new StringBuilder();
	        
	        int left = 10;  // 왼손 위치 *
	        int right = 12; // 오른손 위치 #
	        
	        for(int i : numbers){

	        	if(i==0) i = 11; // 0
	            
	        	switch (i % 3) {
					case 0 :  // 3,6,9,#
						right = i;
						sb.append("R");
						break;
						
					case 1 :  // 1,4,7,*
						left = i;
						sb.append("L");
						break;
					
					case 2 : // 2,5,8,0
						int distanceL = (Math.abs(i - left) / 3) + (Math.abs(i - left) % 3);
		                int distanceR = (Math.abs(i - right) / 3) + (Math.abs(i - right) % 3); 
					
		                if(distanceL == distanceR){
		                    if(hand.equals("left")){
		                        sb.append("L");
		                        left = i;
		                    }else{
		                        sb.append("R");
		                        right = i;
		                    }// if end
		                }else if(distanceL>distanceR){
		                    sb.append("R");
		                    right = i;
		                }else{
		                    sb.append("L");
		                    left = i;
		                }// if end
		                
		                break;
				
				}// if end
	        }// for end
	        return sb.toString();
    }
}