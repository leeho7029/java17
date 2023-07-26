package sec1;
//람다의 추상체는 기능적 인터페이스로 람다를 구현하려면 이와같은 추상체가 필요
@FunctionalInterface
interface MyLambda1 {//추상체
    void print();
}
public class LambdaEx1 {

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
    public static void method1(){
        System.out.println("안녕하세요 메소드1입니다");

    }
    public static void main(String[] args) {
        method1();
        MyLambda1 lam1 = () -> {
            System.out.println("안녕하세요 람다식1입니다");
        };
        lam1.print();
    }
}
