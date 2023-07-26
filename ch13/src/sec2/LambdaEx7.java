package sec2;
@FunctionalInterface
interface MyLambda7<T,Q>{
    boolean compare(T t,Q q);
}
public class LambdaEx7 {
    public static void main(String[] args) {
        MyLambda7<Integer,Integer> comp1 =(a,b)->{
            return (a==b?true:false);
        };
        MyLambda7<String,String> comp2 =(a,b)->{
            return (a.equals(b)?true:false);//문자열 비교는 equals
        };
        System.out.println("비교결과1: "+comp1.compare(10,30));
        System.out.println("비교결과2: "+comp2.compare("r","q"));
    }
}
