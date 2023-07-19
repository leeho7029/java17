package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example7 {
    //파일처리 작업은 반드시 try-catch 예외처리가 필수
    public static void main(String[] args) {
        FileInputStream fis = null; //특정파일의 내용을 저장할 수 있는 클래스
        FileOutputStream ois = null; // 특정 파일의 내용을 불러오기 위한 클래스

        try{
            fis = new FileInputStream("infile.txt");
            try {ois = new FileOutputStream("outfile.txt");
                try {
                    Class clazz = Class.forName("maria.jdbc.driver");
                }catch (Exception e3){
                    System.out.println(e3.getMessage());
                }
            }catch (FileNotFoundException e2){
                System.out.println("해당 파일 없음");
            }
        }catch (FileNotFoundException e){
            System.out.println("해당 파일이 존재하지 않음");
            System.out.println(e.getMessage());
        } catch(Exception e){
            e.printStackTrace();

        }
    }
}
