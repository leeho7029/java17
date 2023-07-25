package sec4;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = new String();
        str1 += "rr";
        str1 += "/";
        str1 += "ee";
        str1 += "/";
        str1 += "tt";
        str1 += "/";
        str1 += "qq";
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer();
        str2.append("ㄱㄱ");
        str2.append("/");
        str2.append("ㄴㄴ");
        str2.append("/");
        str2.append("ㄷㄷ");
        str2.append("/");
        str2.append("ㄹㄹ");
        System.out.println(str2);
        str2.replace(0,3,"김");
        System.out.println(str2);
        System.out.println(str2.toString());

        StringBuilder str3 = new StringBuilder();
        str3.append("가");
        str3.append("-");
        str3.append("나");
        str3.append("-");
        str3.append("다");
        str3.append("-");
        str3.append("라");
        System.out.println(str3.toString());
        str3.insert(2,"gg");
        System.out.println(str3.toString());
        System.out.println(str3.substring(3,7));
        System.out.println(str3.reverse());

        String str = str3.toString();//stringbuilder와 string은 달라서 tostring해야지 split사용가능
        String[] str4 = str.split("-");
        System.out.println(str4);//이상한거 나옴
        System.out.println(Arrays.toString(str4));
    }
}
