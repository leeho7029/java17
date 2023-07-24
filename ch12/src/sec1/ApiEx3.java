package sec1;

import java.util.*;

public class ApiEx3 {
    public static void main(String[] args) {
        //Math.random() : 0~1 의 실수
        int su = (int)(Math.random()*44+1); // 1~45
        System.out.println("임의의 수 :"+su);
        //로또 추첨기
        /*
        String st = "";
        if(st.length()<7){
            int su2 = (int)(Math.random()*44+1);
            int k1 = su2;
            st += "\t"+k1;
            int su3 = (int)(Math.random()*44+1);
            int k2 = su3;
            st +="\t"+ k2;
            int su4 = (int)(Math.random()*44+1);
            int k3 = su4;
            st += "\t"+k3;
            int su5 = (int)(Math.random()*44+1);
            int k4 = su5;
            st +="\t"+k4;
            int su6 = (int)(Math.random()*44+1);
            int k5 = su6;
            st +="\t"+ k5;
            int su7 = (int)(Math.random()*44+1);
            int k6 = su7;
            st +="\t"+ k6;
            System.out.println(st);
        } else {
            System.out.println("false");
        }
        */
        Integer[] lotto = new Integer[6];
        for(int i =0; i<6;i++){
            lotto[i] = (int)(Math.random()*44+1);
            System.out.println(lotto[i]);
        }
        //중복성 해결을 위하여 배열을 Set으로 변환
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto));

        while (gen.size()<6){
            gen.add((int)(Math.random()*44+1));
        }

        //Set을 Array로 변환
        lotto = gen.toArray(new Integer[6]);
        Arrays.sort(lotto);//오름차순 정렬
        //Arrays.sort(lotto, Collections.reverseOrder()); //내림차순정렬하기
        System.out.println(Arrays.toString(lotto));

    }

}
