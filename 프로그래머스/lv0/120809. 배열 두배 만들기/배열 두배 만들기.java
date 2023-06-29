class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answer = new int[numbers.length];

        int a;
        
        for(int i = 0; i < answer.length; i++){
             answer[i] = numbers[i]*2;
        }
        
        return answer;
    }
}