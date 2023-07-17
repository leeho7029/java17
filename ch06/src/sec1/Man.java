package sec1;
//추상화 클래스
public abstract class Man {
    private int item1;
    private String item2;
    //추상화 : 실제 구현내용을 적지 않고 상속받는 클래스에서 구현내용을 기술하므로써
    //물려 받는 입장에서 쓰고 싶은 것이 다를 경우 미리 아래처럼 사용처를 정해버리면
    //그대로 쓰던가 아니면 오버라이딩을 해야함.
    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);

    //추상화 아님
    public  void method5(){
        System.out.println("M5");
    };
    public  int method6(){return 100;}
    public void method7(int no){
        System.out.println("매개값: "+no);
    }
    public  int method8(int no){return no*(no-1);}


}
