package sec1;

public class Example2 {
    public static void main(String[] args) {
        boolean a= true; // TF만 씀, 논리형 변수, 1byte
        byte b = 127; //-128~-1, 0~127까지 표현가능 총256개  129는 overflow 범위 벗어남, 1byte=8비트
        char c ='k'; //문자 변수 , 2byte
        short d = 32767; //반정도정수, -32768~32767, 2byte
        int e =785367890;//4byte
        long f = 785367890;//배정도정수 : 4byte
        //long f = 785367890L;//8byte
        float g = 3.141592f;//f 붙여야됨. 단정도실수, 4yte
        double h= 3.141592; //배정도실수, 8byte, 정밀한 숫자 표현 가능
        double i = 3.14159200000000000008d;//d 붙인다

    //표현범위: -2의 m-1승 ~ 2의 n-1승-1
    //프리미티브 타입 변수는 표현범위가 있으며 표현범위를 벗어나면 오류
    //반드시, 초기화되어야 한다.(값을 집어넣고 써야한다)
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
        System.out.println("i="+i);
    }
}
