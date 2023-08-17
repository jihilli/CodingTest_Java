class Solution {
    public int solution(int[] sides) {
        
        int tmp; 
        int answer = 0;
            
        for(int i = 0; i < sides.length -1 ; i++){
            if( sides[i] > sides[i+1] ){ // 앞의 것이 더 클 때
                tmp = sides[i];
                sides[i] = sides[i+1];
                sides[i+1] = tmp;
            }
        }
        
        if( sides[0]+sides[1] > sides[2] ){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}