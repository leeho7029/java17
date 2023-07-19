package sec1;

import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = new String(a.toUpperCase());
        String c = new String(a.toLowerCase());
        int aa = a.length();
        char[] aaa = a.toCharArray();
        char[] bb = b.toCharArray();
        char[] cc = c.toCharArray();
        char[] dd = new char[aa];

            for(int i=0; i<aa; i++){
                if(aaa[i] != cc[i]){
                    dd[i] = cc[i];
                }else {
                    dd[i] = bb[i];
                }
    }System.out.println(dd);

    }
            }