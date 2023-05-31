import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
	    	
	    Stack<Integer> basket = new Stack<>(); // stack 선언
	    basket.push(0); // 제일 위의 값과 비교하려고
	    	
	    for(int i : moves) {
	    	for(int j=0; j<board.length; j++) {
	    		if(board[j][i-1] == 0) { // 인형없
	    			continue;
	    		}else {
	    			if(basket.peek() == board[j][i-1]) {
	    				basket.pop();
		    			answer +=2;
	    			}else {
	    				basket.push(board[j][i-1]);
	    			}// if end
	    				
	    			board[j][i-1] = 0; // 다뽑음
	    			break;
	    		}// if end
	    	}// for end
	    }// for end
	    	
	    return answer;
    }
}