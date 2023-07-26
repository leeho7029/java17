package sec2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Files 클래스의 write() 메소드는 static이므로 별도의 파일객체를 만들지 않는다.
public class FilesEx1 {
    public static void main(String[] args) {
        //Path-파일의 경로저장//static이라 new 생성자로 못만듬 get으로 만듬
        try {
        Path pat = Paths.get("d:\\kimleeho\\java\\out6.txt");
        Files.write(pat, "I\'m dying of hunger".getBytes() );
    }catch (IOException e){
            e.printStackTrace();
        }
    }
}
