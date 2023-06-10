class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder(my_string);
        int overwriteLength = overwrite_string.length();
        
        for (int i = 0; i < overwriteLength; i++) {
            answer.setCharAt(s + i, overwrite_string.charAt(i));
        }
        return answer.toString();
    }
}
