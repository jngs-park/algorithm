import java.util.Scanner;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int h = h1 + h2;
            int m = m1 + m2;
            if( m >= 60 ) {
                m -= 60;
                h++;
            }
            if( h > 12 ) h -= 12;
            System.out.printf("#%d %d %d\n", t, h, m);
        }
    }
}
