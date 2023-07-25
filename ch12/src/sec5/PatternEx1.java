package sec5;

import java.util.regex.Pattern;

public class PatternEx1 {
    public static void main(String[] args) {
        //regist Expression : 등록시 갖추어야할 데이터의 검증식
        //(), []:그룹핑, w : 단어, d : 정수, {글자수}, {최소글자수,최대글자수}
        //^ : 시작 문자, $ : 끝문자
        //? : 유 또는 무, * :


        String regExp ="(02|031|010)-\\d{3,4}-\\d{4}";//검증식
        String tel1 ="(02)-1004-1234";
        String tel2 ="02-1004-1234";
        String tel3 ="010-1004-1234";
        String tel4 ="(010)-1004-1234";
        String tel5 ="(031)1231234";
        String tel6 ="031-123-1234";
        String tel7 ="031-123-1234";
        //전화번호 검증
        System.out.println("형식 검증1 : "+ Pattern.matches(regExp,tel1));
        System.out.println("형식 검증2 : "+ Pattern.matches(regExp,tel2));
        System.out.println("형식 검증3 : "+ Pattern.matches(regExp,tel3));
        System.out.println("형식 검증4 : "+ Pattern.matches(regExp,tel4));
        System.out.println("형식 검증5 : "+ Pattern.matches(regExp,tel5));
        System.out.println("형식 검증6 : "+ Pattern.matches(regExp,tel6));
        System.out.println("형식 검증7 : "+ Pattern.matches(regExp,tel7));

        //[0-9a-zA-Z]: 영문대소문자숫자,
        //[가-힣] : 한글만 입력가능
        //regExp ="\\w+@\\w+(\\.\\w+)|(?)";
        //regExp ="\\w+@\\w+(\\.\\w+)?";
        regExp = "\\w+@\\w+.\\w*.[a-z]{2,3}$";
        String emaul1 = "kkt@gmail.com";
        String emaul2 = "kkt.naver.com";
        String emaul3 = "chunjae@nate.com";
        String emaul4 = "chunjae.hotmail.com";
        String emaul5 = "chunjae@hotmail";
        String emaul6 = "chunjae@hotmail.ne.kr";

        //이메일 검증
        System.out.println("이메일 검증1 : "+Pattern.matches(regExp,emaul1));
        System.out.println("이메일 검증2 : "+Pattern.matches(regExp,emaul2));
        System.out.println("이메일 검증3 : "+Pattern.matches(regExp,emaul3));
        System.out.println("이메일 검증4 : "+Pattern.matches(regExp,emaul4));
        System.out.println("이메일 검증5 : "+Pattern.matches(regExp,emaul5));
        System.out.println("이메일 검증6 : "+Pattern.matches(regExp,emaul6));
    }
}
