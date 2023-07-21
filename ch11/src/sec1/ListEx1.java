package sec1;

import java.util.ArrayList;
//컬렉션 프레임워크 : 여러 데이터의 모음을 저장할 자료 구조 틀을 의미한다.
//stack, queue, deque, set, map, list,...
//List : 데이터의 순서가 있으며, 데이터 중복이 허용되며, 순서 유지가 됨. -> ArrayList, Vector, LinkedList..
//Set : 일반적인 집합을 말하며, 데이터 중복 허용되지 않음, 순서 유지가 되지 않음 -> Hashset, TreeSet...
//Map : 키와 값을 쌍으로 저장, 키의 중복은 허용되지 않지만, 값은 중복이 허용됨 HashMap, HashTable, TreeMap, Properties..
//Map ex) 1:{"kor":100, "eng":100, "mat":100}, 2:{"kor":100, "eng":100, "mat":100}...
//Stack : 일반적인 데이터, 최신의 데이터를 저장하는 자료구조로 데이터 입출력이 LIFO(Last in first out-후입선출법) 로서 거꾸로 진행되는 자료구조임
//Queue : 데이터 입출력이 FIFO(first in first out)로서 순서대로 진행되는 자료구조로 CPU 스케줄링 - 쓰레드의 우선순위 또는 발생 순으로 처리
//Deque : FIFO/LIFO 운영방식이 모두 가능한 자료구조

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