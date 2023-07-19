package sec2;

public class RunException extends Exception{
    public RunException(){} //함수나 메소드만 () 들어가고 클래슨느 ()안들어감
    public RunException(String message){
        super(message+"사용자 정의 익셉션");
    }

}
