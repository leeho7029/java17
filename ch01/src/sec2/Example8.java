package sec2;

public class Example8 {
    public static void main(String[] args) {
        String name="김이호";
        int age= 29;
        double wt = 64;

        System.out.print("이름 : "+name+"\n나이 : " +age+"\n체중 : "+wt);
        System.out.println("출력문\n");
        System.out.printf("출력문\n");
        System.out.println("이름 :\""+name+"\"\t나이 : \'" +age+"\'\t체중 : "+wt);

        System.out.println("출력문 예시3");
        System.out.printf("이름: \"%s\", \t나이:\'%d\', 체중:%3.2f", name,age,wt);
        int num1=127;
        //%b=2진수, %o=8진수, %x=16진수 ->파이썬, c언어
        //각 진수에 해당하는 숫자를 문자열로 바꾸므로 나중에 숫자로 변환하면
        //그 숫자 그대로 10진수 표기된다. 그러므로 절대 바꾼 데이터는
        //연산을 하지 않도록 해야한다.
        String bin = Integer.toBinaryString(num1);//num1을 이진수로 바꾼다
        String oct = Integer.toOctalString(num1);//8진수로
        String hex = Integer.toHexString(num1);//16진수

        System.out.println("\n2진수 : " +bin);
        System.out.println("8진수 : " +oct);
        System.out.println("16진수 : " +hex);
        System.out.println("10진수 : " +num1);

        String k = bin+ oct + hex;
        System.out.println("더한값: "+k);//그냥 문자열처럼 더해짐
        //int k = bin + oct + hex; 정수가 아닌기에 이렇게 하면안됨


        //System.out.println(Integer.parseInt());  Integer.parseInt()-정수로 바꾼다(16진수로 10진수로 안바꿔준다)

        int b1 = 0b101111;
        int o1 = 0746;
        int x1 = 0x4fc;


        System.out.println("b1="+b1);
        System.out.println("o1="+o1);
        System.out.println("x1="+x1);

        int j = b1 + o1 +x1;
        System.out.println("j= "+j);
    }
}
//대문자로 시작하면 참조형변수