package sec1;

public class Student {
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    //1. 리턴없음, 매개변수 없음
    public void method1(){
        System.out.println("메서드1");

    }
    //2. 리턴있음, 매개변수 없음
    public int method2(){
        int a = 1004;
        return a;
    }

    //3.리턴없음, 매개변수 있음
    public void method3(int a){
        System.out.println("당신은 "+a);
    }

    //4.리턴있음, 매개변수 있음
    public int method4(int a){
        return a*a;

    }
}
