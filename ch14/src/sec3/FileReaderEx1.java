package sec3;

import java.io.FileReader;
import java.io.IOException;
//FileReader : 바이트 단위로 불러올 경우 활용
//파일을 읽어오는 방법 : FileReader, BufferedReader, Scanner, Files
public class FileReaderEx1 {
    public static void main(String[] args) throws IOException,Exception {

        FileReader fr = new FileReader("out3.txt");
        int rd;
        while ((rd = fr.read()) != -1){
            System.out.println((char) rd);
        }
    }
}
