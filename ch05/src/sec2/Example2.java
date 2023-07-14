package sec2;

import sec1.Score;

public class Example2 {
    public static void main(String[] args) {   //args=argument = 매개변수
        Score el1 = new Score();
        System.out.println("번호 : "+el1.getNum()); //저장된 값 getNum, 그냥 Num안됨
    }
}
//오버로딩은 하나의 클래스 내에서 데이터 타입이 다르거나 매개변수의 개수가 다르면 같은 이름으로 여러개 만들 수 있다

