package sec1;

class SMThread extends Thread {
    @Override
    public synchronized void start() { //쓰레드 생성 // synchronized
        this.method1(); //동기화 블록(synchronized)에 기재된 쓰레드는 병행 수행된다.
        super.start();
    }

    @Override
    public void run() {  //쓰레드로 실행할 내용을 기술
        int[] arr = {95, 60, 85, 70, 90, 80};
        for (int i=0; i<arr.length;i++){
            System.out.println("점수 : " + arr[i]); //전체 single Thread 쓰레드는 6개
            try {
                Thread.sleep(1000);
                //대기 시간 부여하고, 지정한 밀리초만큼 wait되며, 그 시간이 지나면 자동으로 wake up된다
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void method1(){
        for(int i=1;i<7;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Thread th1 = new SMThread();
        th1.start(); //쓰레드 생성 후 자동실행된다

    }
}

