package sec1;

public class Qna extends Board{

    public static final  String DUMMY = "테스트글제목"; //상수는 항상 대문자로//final-더이상 상속 못함
    private int level; //level 0이면 문의글, 1이면 답글, 2이면 답글의 질문, 3이면 답글의 질문의 답글
    private int parno;

    public Qna(){super();}

    public Qna(int no) {super (1);}

    public Qna(int level, int parno) {
        this.level = level;
        this.parno = parno;
    }

    public int getLevel() {
        return level;
    }

    public int getParno() {
        return parno;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }

    @Override
    public void method2(){
        System.out.println("Qna 입니다.");
    }
}
