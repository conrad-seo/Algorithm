class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int answer = Integer.parseInt(ab);
        int c = 2*a*b;
        if(c > answer) {
            answer = c;
        }
        return answer;
    }
}