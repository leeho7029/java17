package sec1;
 //여러개의 클래스 등록-public안붙임 메인 클래스는 퍼블릭 달려있어야함
public class Score {    //메인 클래스
    private int num;
    private String name;
    private int kot;
    private int eng;
    private int mat;


    public Score(int num) {  //생성자(constructor) 함수 알트 인서트//여러개 선택-시프트 누르고 선택
    }

    public Score(int num, String name, int kot, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kot = kot;
        this.eng = eng;
        this.mat = mat;
    }

    //프리빗으로 잠겼으면 겟터로 접근


    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getKot() {
        return kot;
    }

    public int getEng() {
        return eng;
    }

    public int getMat() {
        return mat;
    }
}