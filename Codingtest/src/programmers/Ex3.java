package programmers;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//결과값이 a + b = 실제값 //모양으로 나와야됨
        System.out.print( a  +" + "+ b  +" = " +(a+b));
    }
}
