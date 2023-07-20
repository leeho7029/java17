package sec2;
//제너릭의 제한 - <T extends 제한클래스>
//제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class MultiEx3 {
    public static void main(String[] args) {
//        Child<Parent> c1 = new Child<Parent>(); 오류- my로 제한해놔서
        Child<My> c2 = new Child<>();
    //    Child<Child> c3 = new Child<>(); 자기 자신은 만들수없음
        Child<Season> c3 = new Child<>();
    }
}
