package sec2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//PrintWriter : 출력을 버퍼, 한줄, 한글자, 문자열 등의 모든 단위의 파일에 쓰기 작업
public class PrinterWriterEx1 {
    public static void main(String[] args) {
        try{
            File file = new File("out4.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fw);

            writer.write("점심시간10분");
            writer.println("배고파배");
            writer.print("밥");
            writer.print("\n 진짜");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
