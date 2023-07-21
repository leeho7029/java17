package sec1;

import java.util.List;
import java.util.Vector;



public class ListEx5 {
    public static void main(String[] args) {


        List<Qna> q = new Vector<>();
        Qna a = new Qna(1, "제목", "ㄱ");
        q.add(a);
        q.add(new Qna(2,"제목2","ㄴ"));
        q.add(new Qna(3,"제목3","ㄷ"));
        q.add(new Qna(4,"제목4","ㄹ"));
        System.out.println("글번호\t제목\t내용");
        for (Qna p :q){
            System.out.println(p.qno+"\t"+"\t"+p.content+"\t"+p.title);
        }
    }
}