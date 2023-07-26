package sec1;
@FunctionalInterface
interface MyLambda4 {
    String print(int a);
}
public class LambdaEx4 {
    public static void main(String[] args) {
        MyLambda4 l4 = (a) -> {
            return a+"김김";
        };
        System.out.println(l4.print(1004));
    }
}
