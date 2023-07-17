package sec1;

class Chanwon {
    private int seq;
    private int data;

    public Chanwon() { this(1);
    }

    public Chanwon(int seq) {this(seq,100);}
    public Chanwon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}
class Sehun{
    private int num = 1;
    private String data = "김기태";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
public class Chunjae {
    //멤버 필드 = 변수, 상수
    private int no;
    protected int point;
    int partno;
    public String name;
    public final static double PI = 3.141592;//상수

    public void setValue(int no){ //private 멤버는 클래스내부에서만 this로 접근가능
        this.no = no;
    }
}
