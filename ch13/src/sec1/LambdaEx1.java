package sec1;

public class LambdaEx1 {
    public int method1(int x, int y){
        return x*y;
    }
    /*
    람다식 구현체
    (x,y)->{x*y};
    ()->{} : Basic
    (x)->{} : consumer
    ()->{x} : Supplier
    (x)->{x*x} :
    Operator-운영자-주로 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입 ,
    Function-주로 매개변수를 받아 처리 한 후 그 결과를 형변환하여 반환하는 타입,
    predicate-주로 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환한다

     */
    public static void main(String[] args) {

    }
}
