package sec2;

import sec1.Student;

public class StudentEx1 {
    public static void main(String[] args) {
        Student st1 = new Student();

        //메서드 1의 활용(리턴x, 매개변수x)
        st1.method1();
        //메서드2의 활용(리턴o, 매개변수x)
        int a = st1.method2();
        System.out.println(a);

        System.out.println(st1.method2());

        //메섣3의 화용(리턴x, 매개변수
        st1.method3(1004);


    }
}
