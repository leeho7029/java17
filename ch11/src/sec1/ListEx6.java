package sec1;

import java.util.LinkedList;
import java.util.List;

class Student{
    public int sno;
    public String sname;
    public int point;
    public Student(){}
    public Student(int sno, String sname, int point){

    }
}

public class ListEx6 {
    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();

        s.add(new Student(1,"ㄱ",10));
        s.add(new Student(2,"ㄴ",9));
        s.add(new Student(3,"ㄷ",8));
        s.add(new Student(4,"ㄹ",7));


    }
    //List와 LinkedList
    //일반적인 속도는 LinkedList가 이전포인터와 다음포인터가 있어 훨씬 빠르나
    //중간 삭제나 주간 삽입의 경우는 List가 더 빠르다.
}
