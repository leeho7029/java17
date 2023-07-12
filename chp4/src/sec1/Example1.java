package sec1;

public class Example1 {
    public static void main(String[] args) {
        int[] a; //선언1 = 타입[] 배열명; 메모리할당 아직 안됨
        int b[]; //선언2 = 타입 배열명[]; 메모리할당아직 안됨

        int[] c = new int[3]; //선언과 할당
        int d;

        //a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에 오류생김
        System.out.println("a[0]="+c[0]);// a[0]-아직 할당x라 안됨
        //d는 primitive 타입이므로 반드시 초기화가 필요함
        //System.out.println("d="+d);

    }
}
