package sec4;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = new String("Kimlee");
        String str2 = "Kimlee";
        System.out.println("name : "+str1);
        System.out.println("네 번째 글자 : "+str1.charAt(3));
        System.out.println("문자열 비교 : "+ str1.equals(str2));

        byte[] bArr = str1.getBytes();//문자열을 바이트배열로 분리
        System.out.println(bArr+" 이상하게 나온다");//이상하게 나옴
        System.out.println("byte[] 의 출력 : ");
        //첫번째 :  별도의 메소드를 호출하여 반복문으로 출력
        printArr(bArr);
        System.out.println();
        //두번째 : Arrays.toString(배열명);
        char[] cArr = new char[bArr.length];
        for(int i=0;i<bArr.length;i++){
            cArr[i] = (char) bArr[i];

        }
        System.out.println(Arrays.toString(cArr));
        System.out.println("i는 몇번째? "+(str1.indexOf("i")));//특정 문자의 인덱스 구하기
        System.out.println("인덱스가 3부터 6전까지 : "+(str1.substring(3,6)));
        System.out.println("소문자로 : "+str1.toLowerCase());
        System.out.println("대문자로 : "+str1.toUpperCase());
        String data1 = str1.replace("m","W");
        System.out.println("m을 W로 변경 : "+data1);
        String str3 = "       my name is lee, kim"    ;
        System.out.println("str3의 글자수 : "+(str3.length()));
        System.out.println("공백제거 전0 : "+str3);
        System.out.println("공백제거 후1 : "+str3.trim());
        System.out.println("str3의 공백 제거 후 글자수 : "+(str3.trim().length()));

        int k = 1004; //k를 string으로 형변환

        //String t = (String) k; //이거 안됨
        String t1 = k +""; // 비추
        String t2 = String.valueOf(k);//추천
        System.out.println(t1);
        System.out.println(t2);

        //System.out.println("t1이 문자열?" + (k instanceof String));// 인스턴스오브-객체다 참조형이 들어가야된다 k가 int라 참ㅈ형이 아니다
        System.out.println("t1이 문자열?" + (t1 instanceof String));
        System.out.println("t2이 문자열?" + (t2 instanceof String));




    }
    static void printArr(byte[] arr){
        for(int i = 0; i<arr.length;i++){
            char a= (char)arr[i];
            System.out.print(a);
        }

    }
}
