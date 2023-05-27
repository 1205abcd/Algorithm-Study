class Solution2 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++) {
            int sum=0;
            for(int j=0;j<targets[i].length();j++) {
                int min=Integer.MAX_VALUE;
                for(int k=0;k<keymap.length;k++) {
                    if(min>keymap[k].indexOf(targets[i].charAt(j))&&keymap[k].indexOf(targets[i].charAt(j))!=-1)
                        min=keymap[k].indexOf(targets[i].charAt(j))+1;
                }
                if(min==Integer.MAX_VALUE) {
                    answer[i]=-1;
                    sum=0;
                    break;
                }

                else {
                    sum+=min;
                }

            }
            if(sum!=0)
                answer[i]=sum;
        }
        return answer;
    }
}