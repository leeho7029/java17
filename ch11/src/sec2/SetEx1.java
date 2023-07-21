package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();

        //데이터 중복 x, 순서유지x
        Set<String> set2 = new HashSet<>();
        set2.add("ㄱ");
        set2.add("ㄴ");
        set2.add("ㄷ");
        set2.add("ㄹ");
        set2.add("ㄷ");
        set2.add("ㄹ");

        Iterator it =set2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //데이터 중복 o, 순서유지o
        List<String> ls2 = new ArrayList<>();
        ls2.add("ㄱ");
        ls2.add("ㄴ");
        ls2.add("ㄷ");
        ls2.add("ㄹ");
        ls2.add("ㄷ");
        ls2.add("ㄹ");
    }
}
