package sec2;

public class CollectionsEx2 {
    public static void main(String[] args) {
        Week[] wk = Week.values();
        for(Week w:wk){
            System.out.println(w.korean+"("+w.chinese+")");
        }
        System.out.println(Week.Monday.name());//이름만 나오게
        System.out.println(Week.Monday.ordinal());//인덱스 추출

    }
}
