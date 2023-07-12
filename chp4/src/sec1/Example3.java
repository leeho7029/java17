package sec1;

public class Example3 {
    //원소 추가 함수
    public static String[] add(String[] originArr, String txt) {
        String[] newArr = new String[originArr.length + 1];//새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        for (int i = 0; i < originArr.length; i++) {   //원래 배열 데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
        newArr[originArr.length] = txt;                                            //추가되는 원소를 txt변수로 입력받아 새로운 원소로 추가
        return newArr;

    }

    public static String[] remove(String[] originArr) {
        String[] newArr = new String[originArr.length - 1];//새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        for (int i = 0; i < originArr.length - 1; i++) {   //원래 배열 데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
                                              //추가되는 원소를 txt변수로 입력받아 새로운 원소로 추가
        return newArr;

    }

    public static void main(String[] args) {
        //원소 추가 요청
        String[] originArr = {"물방울", "다람쥐", "청설모", "강아지", "꾀꼬리"};
        //originArr [5] = "독수리";

        originArr=add(originArr,  "독수리");
        originArr =add(originArr, "기러기" );
        for(String s:originArr){
            System.out.println(s);
        }
        System.out.println("-----------");
        originArr= remove(originArr);
        for(String s:originArr) {
            System.out.println(s);
        }



    }


}


