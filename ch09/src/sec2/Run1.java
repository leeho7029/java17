package sec2;
//Runnable : 실행 가능한 객체를 만들기 위한 인터페이스 -> 사용자가 상속받아 새로운 클래스를 생성하여 활용
//sec1 - Thread3과 비교
class SBRunnable implements Runnable {
    @Override //interface라 오버라이딩 필수
    public void run() {
        String[] str = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //출석을 부르기
        for(String name:str){
            System.out.println("출석체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SCRunnable implements Runnable {
    @Override //interface라 오버라이딩 필수
    public void run() {
        String[] str = {"ㄱr","ㄴr","ㄷr","ㄹr","ㅁr","ㅂr"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //퇴실체크하기
        for(String name:str){
            System.out.println("퇴실체크 : "+name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Run1 {
    public static void main(String[] args) {
        Runnable sbRun1;          //선언부         //서로 호환이 가능하도록
        sbRun1 = new SBRunnable();//생성부
        Thread t1 = new Thread(sbRun1);
        t1.start();


        Runnable scRun1;          //선언부         //서로 호환이 가능하도록
        scRun1 = new SCRunnable();//생성부
        Thread t2 = new Thread(scRun1);
        t2.start();

      /*  sbRun1 = new SCRunnable();
        Thread t2 = new Thread(sbRun1);
        t2.start();*/ //이 방법으로 scrun start해도 된다
    }
}


