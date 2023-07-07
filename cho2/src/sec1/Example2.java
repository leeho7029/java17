package sec1;

public class Example2 {
    public static void main(String[] args) {
        //대입연산: =,+=, -=, *=, /=
        int su = 0;


        //int su = 10 못한다
        su+=10; //su = su+10
        System.out.println("su+=10 =>"+su);

        su-=5; //su=su-5
        System.out.println("su-=5 =>"+su);

        su*=10; //su=su*10
        System.out.println("su*=10 =>"+su);


        float num = 0.0f;
        int su2 = su;
        su/=4; //su=su/4

        num = su2 / 4.0f; // num = (float)su / 4  이 둘중 하나로 해야 실수로 저장

        System.out.println("su/=4 =>"+su);
        System.out.println("su/=4 =>"+num);

        //증감연산: ++,-- 등의 전위와 후위가 존재
        int a = 10, b= 10;
        //a= a+1 , a+=1, a++, ++a의 값은 같다
        System.out.printf("a++의 결과 : %d\n", a++); //후위 연산-마지막으로 출력된다
        System.out.println("나중 출력 : "+a);
        System.out.printf("++b의 결과 : %d\n", ++b); //전위 연산
        System.out.println("나중 출력 : "+b);
        System.out.printf("b--의 결과 : %d\n", b--); //후위연산
        System.out.println("나중 출력3 : "+b);
        System.out.printf("a--의 결과 : %d\n", --a);// 전위 연산
        System.out.println("나중 출력 : "+a);

    }
}

