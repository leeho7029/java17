package sec3;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class SystemEx4 {
    public static void main(String[] args) {
        System.out.println("운영체제 : "+System.getProperty("os.name"));//get은 값을 불러오는것//env-환경변수
        System.out.println("사용자 : "+System.getProperty("user.name"));
        System.out.println("사용자 디렉토리 : "+System.getProperty("user.home"));
        System.out.println("자바 버전 : "+System.getProperty("java.version"));
        System.out.println("자바 홈 : "+System.getProperty("java.home"));

        Properties props = System.getProperties(); //위에 한거 한꺼번에 가져오기
        Set keys = props.keySet();
        for (Object obj : keys){
            String key = (String) obj;
            String val = System.getProperty(key);
            System.out.println("["+key+"]:"+val);
        }
    }
}
