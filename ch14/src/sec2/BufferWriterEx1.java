package sec2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//출력 방식 : BufferedWriter, printWrite, FileOutput, Files, DataOutputStream
public class BufferWriterEx1 {
    public static void main(String[] args) {
        /*
        String path = "d:\\kimleeho\\java\\out3.txt";
        File file = new File(path);
         */
        try {
            File file = new File("out3.txt");//노트

            if (!file.exists()) { //파일이 없을때 만들어야함
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);//연필
            BufferedWriter writer = new BufferedWriter(fw);//연필사용자
            //연필로 노트에 쓰기,string 단위
            writer.write("점심시간 10분전");
            writer.close();//파일객체는 자동으로 닫혀서 close필요x writer는 close필요

        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
