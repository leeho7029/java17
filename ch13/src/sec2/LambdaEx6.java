package sec2;

import java.util.Scanner;

//<매개변수타입, 반환타입>
@FunctionalInterface
interface MyLambda6<T, Q> {
    Q ca1c(T x,T y);
}
public class LambdaEx6 {
    public static void main(String[] args) {
        //빼기//더하기//곱하기//나누기 구현체 작성
        MyLambda6<Integer, Double> plus = (x, y) -> {
            return (double)x+y;
        } ;
        MyLambda6<Integer, Double> minus = (x, y) -> {
            return (double)x-y;
        } ;
        MyLambda6<Integer, Long> mul= (x, y) -> {
            return (long)x*y;
        } ;
        MyLambda6<Integer, Double> div = (x, y) -> {
            return (double)x/y;
        } ;
        MyLambda6<Integer, Integer> mod = (x, y) -> {
            return x%y;
        } ;
        System.out.println("더한결과 "+plus.ca1c(30,60));
        System.out.println("뺀결과 "+minus.ca1c(90,60));
        System.out.println("곱한결과 "+mul.ca1c(30,60));
        System.out.println("나눈결과 "+div.ca1c(20,60));
        System.out.println("나머지결과: "+mod.ca1c(11,60));

    }


    }

