package sec1;

import java.util.Date;//alt enter로 만들었음

public class Example5 {
    public static void main(String[] args) {
        Date birth1 = new Date();
        String birth2 = "2023-07-07";
        System.out.println(birth1);
        System.out.println("확인1 : "+(birth1 instanceof Date));//타입 물어보는것 birth 데이터가 Date로 만든것인가?
        //System.out.println("확인2 : "+(birth2 instanceof Date)); Date로부터 나온게 아니라 빨간밑줄 뜬다

        //삼항 연산자: 조건 ? 참 : 거짓

        int point = 84;
        String pan = point>=80? "합격" : "불합격";
        System.out.println("판정 : "+pan);
        
    }
}
//클래스는 대문자 시작 패키지는 소문자 시작 