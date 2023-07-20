package sec1;

public class GenEx1 {
    public static void main(String[] args) {
        Gen1 g1 = new Gen1();
        g1.method1("김김김");
        //g1.setT(20); //제네릭이 아니라 오류남
        g1.setT("r");//일반 클래스로 만들어진 필드의 값은 오로지 한가지 타입밖에 지원되지 않으므로
        //t 필드는 String 이므로 setT()의 저장되는 값은 String으로 저장해야한다
    }
}
