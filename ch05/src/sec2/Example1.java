package sec2;

//shape 클래스는 현재 클래스인 example1 클래스와 다른 패키지인 sec1에 존재하므로
//import가 필요하다
import sec1.Shape;

//string 클래스와 같이 base 클래스인 경우는 사용자 정의 클래스와 다르게
//별도의 import가 필요없음. java 언어 안에 내장되어 있다.


public class Example1 {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("김이호");

        //클래스명 인스턴스명 = new 생성자함수();
        Shape s1 = new Shape();


        s1.type = "";
        s1.length = 50;
        s1.area = s1.length * s1.length ;
        System.out.println("현재 도형의 면적은 ? " + s1.area);



        Shape s2 = new Shape("triangle");
        s2.length=30;

        Shape s3 = new Shape("circle", 20);
        double d3 = s3.calcArea();
        System.out.println("현재 도형3의 면적은 ? " + d3);
    }
}
