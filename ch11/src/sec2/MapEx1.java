package sec2;

import java.util.*;
import java.util.Map.*;//map.entry 랑 다르나?
public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();//<키,값>
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties();// 속성 내포되어 있어 지정 안함, 다른 맵과 구조가 완전히 다름


        map1.put("no",1);//추가-get 가져오기-get
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println("국어점수 : " + map1.get("kor"));
        if(map1.containsKey("soc")){
            System.out.println("해당 키가 존재합니다.");
        } else{
            map1.put("soc",100);
        }
        if(map1.containsValue(100)){
            System.out.println("만점 과목이 있습니다");
        } else{
            System.out.println("만점 과목 없음");
        }

        //맵의 순회
        for(Entry<String,Integer> entryset : map1.entrySet()){
            System.out.println(entryset.getKey()+":"+entryset.getValue());
        }

        map2.put("name", "kim");
        map2.put("age", "29");
        map2.put("height","165.5");
        map2.put("weight","65");
        System.out.println(map2);


        map4.setProperty("dae","40");//값 저장, put이 아님, value-무조건 문자

        map4.setProperty("margin","40px");
    }
}
