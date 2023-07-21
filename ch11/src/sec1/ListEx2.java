package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
    public static void main(String[] args) {
        List lst1 = new ArrayList();
        //lst1은 list 구조이기 때문에 Vector와 LinkedList로 변환 가능
        lst1 = new Vector();
        lst1 = new LinkedList<>();

        ArrayList lst2 = new ArrayList();
        //Vector lst2 = new Vector();


        method1(lst1);
        //method2(lst2);

    }
    public static void method1(List ls){} //list는 interface로 서로 오갈 수있는 교량이 되어주기 때문에 list로 받는게 좋다
    public static void method2(ArrayList ls){}

}
