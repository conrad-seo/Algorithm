class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a); 
        
        int result = Integer.parseInt(ab);
        
        if (Integer.parseInt(ba) > result) {
            result = Integer.parseInt(ba);
        }
        
        return result;
    }
}
