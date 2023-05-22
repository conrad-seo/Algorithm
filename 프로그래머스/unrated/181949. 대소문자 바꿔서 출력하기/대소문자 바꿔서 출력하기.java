import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c;
        for(int i = 0; i<a.length(); i++) {
            char b = a.charAt(i);
            if(65<=b && b<=90) {
                c = (char)(b+32);
            }
            else if(97<=b && b<=122) {
                c = (char)(b-32);
            }
            else {
                c = b;
            }
            System.out.print(c);
        }
    }
}