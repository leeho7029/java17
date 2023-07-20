package sec1;

import java.util.ArrayList;

//stack, queue, deque, set, map, list,...

public class ListEx1 {
    public static void main(String[] args) {
        String[] author = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ"};
        ArrayList<Board> lst= new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            Board bd1 = new Board();
            bd1.setNo(i+1);
            bd1.setTitle("더미 제목" + (i+1));
            bd1.setContent("더미 글 내용" + i+1);
            bd1.setAuthor(author[i]);
            bd1.setResdate("2023-07-19");
            lst.add(bd1); //추가
        }
        prt(lst);
    }
    public static void prt(ArrayList<Board> lst){
        for(Board bd:lst){
            System.out.println("글번호 : "+bd.getNo());
            System.out.println("글제목 : "+bd.getTitle());
            System.out.println("작성자 : "+bd.getAuthor());
            System.out.println("작성일 : "+bd.getResdate());
        }
    }
}