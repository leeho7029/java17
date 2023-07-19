package programmers;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aa = a.length();
        if((aa>=1)&&(aa<=20)) {
            String b = new String(a.toUpperCase());
            String c = new String(a.toLowerCase());


            char[] bb = b.toCharArray();
            char[] cc = c.toCharArray();


            for (int i = 0; i < bb.length / 2 + 1; i++) {
                System.out.print(bb[2 * i]);
                for (int j = i + 1; i < bb.length / 2; ) {
                    System.out.print(cc[2 * j - 1]);
                    break;
                }


            }
        }
    }
}