package sec2;

import java.util.Calendar;
import java.util.Scanner;

public class CollectionEx3 {
    public static void main(String[] args) {
        //입력한 월의 달력 출력하기
        //만약, 7월의 경우
        /*
        7월

        일 월 화 수 목 금 토
                        1
        2   3  4 5 6 7  8
        9   10 ....
        ....
        30  31
         */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int a1 = Integer.parseInt(a);



        Calendar c1 = Calendar.getInstance();
        int c2= c1.get(Calendar.YEAR)+c1.get(Calendar.MONTH)+c1.get(Calendar.DAY_OF_MONTH);
        System.out.println(c2);
        System.out.println("년 : "+c1.get(Calendar.YEAR));
        System.out.println("월 : "+(c1.get(Calendar.MONTH)+1));
        System.out.println("일 : "+c1.get(Calendar.DATE));
        System.out.println(c1);
        System.out.println(Week.Monday);
    }
}
