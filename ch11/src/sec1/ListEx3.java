//package sec1;
//
//import java.util.ArrayList;
//import java.util.List;
//class Student{
//    public int sno;
//    public String sname;
//    public int point;
//}
//public class ListEx3 {
//    public static void main(String[] args) {
//        List<String> lst1 = new ArrayList<>();
//        lst1.add("ㄱ"); //add는 요소추가
//        lst1.add("ㄴ");
//        lst1.add("ㄷ");
//        lst1.add("ㄹ");
//        System.out.println(lst1);
//        lst1.remove(1);  //특정 인덱스 위치의 요소 제거
//        System.out.println(lst1);
//        lst1.removeAll(lst1); //모든 요소 제거
//        System.out.println(lst1);
//        lst1.add("ㄱㄱ");
//        lst1.add("ㄴㄴ");
//        lst1.add("ㄷㄷ");
//        lst1.add("ㄹㄹ");
//        System.out.println(lst1);
//        System.out.println("리스트의 요소 수 : "+lst1.size());
//        System.out.println("특정 인덱스가 2인 데이터 : "+lst1.get(3));
//
//        if(lst1.contains("ㅁㅁ")){  //존재 유무 판단
//            System.out.println("ㅁㅁ이 존재합니다.");
//        }else{
//            System.out.println("ㅁㅁ이 존재하지 않습니다.");
//        }
//        if(lst1.isEmpty()){ //빈 리스트를 검증
//            System.out.println("현재 리스트가 비어 있음");
//        }else{
//            System.out.println("현재 리스트가 사용 중임");
//        }
//
//        for (int i=0; i<lst1.size();i++){
//            System.out.println(lst1.get(i));
//        }
//        System.out.println("-----------------");
//        for (String s:lst1){
//            System.out.println(s);
//        }
//
//        List<Student> sl = new ArrayList<>();
//        Student q1 = new Student();
//        q1.sno = 1;
//        q1.sname = "ㄱ";
//        q1.point = 90;
//        Student q2 = new Student();
//        q2.sno = 2;
//        q2.sname = "ㄴ";
//        q2.point = 80;
//        Student q3 = new Student();
//        q3.sno = 3;
//        q3.sname = "ㄷ";
//        q3.point = 70;
//        sl.add(q1);
//        sl.add(q2);
//        sl.add(q3);
//
//        for(int i = 0; i<sl.size();i++){
//            Student s = sl.get(i);
//            System.out.println("번호 : "+s.sno);
//            System.out.println("이름 : "+s.sname);
//            System.out.println("점수 : "+s.point);
//        }
//        System.out.println("*******************");
//        for (Student s:sl){
//            System.out.println("번호 : "+s.sno);
//            System.out.println("이름 : "+s.sname);
//            System.out.println("점수 : "+s.point);
//        }
//    }
//}
