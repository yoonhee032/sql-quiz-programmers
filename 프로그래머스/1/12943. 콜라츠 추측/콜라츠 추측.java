class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        Long n =  Long.valueOf(num);
        
        while(n != 1) {
            if(n % 2 == 0){
                n = n / 2;
                answer++;
            } else {
                n = n*3 + 1;
                answer++;
            }
            if(answer == 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}