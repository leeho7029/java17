package sec2;

import java.sql.SQLOutput;
import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date today = new Date();
                //new = 객체 생성
        String data1 ="2023-07-13"; //기본 변수타입
        String data2 = new String("2023-07-13");//레퍼런스 타입

        if(data1==data2) System.out.println("서로 같음");
        else System.out.println("서로 다름");
        //문자열과 객체타입은 값이 같다고 하더라도 등호(==)로 비교할 수 없다
        //값 비교를 위해서는 equals()를 사용하여 비교하여야 한다.
        if(data1.equals(data2)) System.out.println("서로 같음");
        else System.out.println("서로 다름");

        String info ="";
        String name = "김이호";
        int age = 29;
        float ht = 165.5f;

        info = name + age + ht; //단 한글자라도 들어가면 문자열이 된다
        System.out.println("info="+info);
    }
}
