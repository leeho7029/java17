package sec1;

public class Example4 {
    public static void main(String[] args) {
        //부호            32 16  8 4 2 1
        // 양수0, 음수1    1  0   0 0 0 0
        int a = 20; // 10100
        int b = 14; // 01110
        //비트 연산 = 2진수
        System.out.println("a & b : "+(a&b));//00100 = 4 (입력이 모두1일 때만 1)
        System.out.println("a | b : "+(a|b));//11110 = 30 (1만 있으면 1)
        System.out.println("~a : "+(~a));//     (0을 1로 1을 0으로)
        System.out.println("a ^ b :"+(a^b)); //(^ = xor) 11010 (입력이 서로 다를때 1)
        System.out.println("a>>2 : "+(a>>2));//(한번 이동에 나누기 2씩)
        System.out.println("a<<2 : "+(a<<2));//(한번 이동에 곱하기 2씩)
        System.out.println("a>>>2 : "+(a>>>2));//(한번 이동에 나누기 2씩, >> >>> 차이없다)
        //System.out.println("a<<<2 : "+(a<<<2));//(이건 못함 없음 <<<는 없음)


        //0   -1//
        //1   -2//
        //2   -3//
        //....//
        //20  -21// 보수//9의 보수//
        //가산기 보수기 감산기//
    }
}
