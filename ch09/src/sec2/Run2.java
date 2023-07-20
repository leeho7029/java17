package sec2;

public class Run2 {
    public static void main(String[] args) {
        //쓰레드 정보 출력
        Thread curT = Thread.currentThread();//기울어진 글씨체-static static은 new 키워드 사용X
                                            //현재 실행 중인 쓰레드의 객체

        System.out.println("현재 동작 중인 쓰레드 이름 : "+ curT.getName());//현재 동작 중인 쓰레드 이름
        System.out.println("현재 동작 중인 쓰레드 개수 : " + curT.activeCount());//현재실행중인 쓰레드 개수



    }
}
