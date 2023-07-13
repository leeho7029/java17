package sec2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        String code = "950513-1234567";
        char m = code.charAt(7);//char 는 작은 따옴표
        String gender = (m== '1'|| m == '3') ? "남" : "여";
        String yy = code.substring(0,2);//2전까지 0,1만 //특정 번째 부터 특정 번째 전까지 추출
        String mm = code.substring(2,4);//4전까지 2,3만
        String dd = code.substring(4,6);//6전까지 4,5만

        System.out.println("성별코드 : "+m);
        System.out.println("성별 : "+gender);
        System.out.println("생년월일 : "+(yy+"-"+mm+"-"+dd));

        String nick = "kimleeho";
        int idx = nick.indexOf('g'); //해당 문자의 인덱스를 반환
        System.out.println("g의 문자 인덱스 값 : "+idx); //없으면 -1 값이 나온다
        int idx2 = nick.indexOf('i'); //해당 문자의 인덱스를 반환
        System.out.println("i의 문자 인덱스 값 : "+idx); //앞의 순서가 먼저 나온다
        idx = nick.lastIndexOf('i');
        System.out.println("i의 마지막 찾은 경우의 인덱스 값 : "+idx);

        String name1 = nick + " imperial";
        String name2 = nick.concat("imperial"); //문자열 결합 연산

        //문자열을 문자배열로 : toCharArray()
        //문자열을 바이트배열로 : getBytes()
        //char[] nArr = nick.getBytes(""); 문자열을 문자배열로 바꿈 k i m l e e h o 로 분리됨
        char[] nArr = nick.toCharArray(); //문자열을 문자배열로 바꿈 k i m l e e h o 로 분리됨
        byte[] bArr = nick.getBytes();

        System.out.println("@ 2번째 : "+nArr[2]);//m
        System.out.println("# 2번째 : "+bArr[2] );//109 -> m의 아스키코드 값


        int age = 29;
        float ht = 165.5f;
        boolean ps = true;

        String val1 = String.valueOf(age);//정수를 문자열로 변환
        String val2 = String.valueOf(ht);//실수를 문자열로 변환
        String val3 = String.valueOf(ps);//

        if(val1.equals("29")) System.out.println("문자열 변환 성공");//이게 왜 문자열 변환 성공? 등호 써야되는거 아닌가?

        //대문자로(toUpperCase()/ 소문자로(toLowerCase())

        System.out.println("대문자로 변환 :"+ nick.toUpperCase());
        System.out.println("소문자로 변환 :"+ nick.toLowerCase());

        //해당 특정 문자를 찾아 바꾸기 -> replace(찾는 문자, 바꿀문자)
        String nick2 = nick.replace('k','g');
        System.out.println("바뀐 값 : "+nick2);

        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "강-바다/산-들/논-도시";

        //문자열배열을 특정 구분자로 요소 분리 -> split
        String[] stArr1 = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("/|-");

        //문자열배열을 출력 => Arrays toString(문자열배열)
        System.out.println(Arrays.toString(stArr1));
        System.out.println(Arrays.toString(stArr2));

        String data1 = "         kim      ";
        String data2 = "lee              ";
        String data3 = "          ho";

        System.out.println("글자수1 : "+data1.length());
        System.out.println("글자수2 : "+data2.length());
        System.out.println("글자수3 : "+data3.length());

        //해당 문자열의 앞 뒤의 공백제거 -> trim()
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();

        System.out.println("글자수1 : "+trans1.length());
        System.out.println("글자수2 : "+trans2.length());
        System.out.println("글자수3 : "+trans3.length());

    }
}
