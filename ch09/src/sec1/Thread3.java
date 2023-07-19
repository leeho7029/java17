package sec1;

class SAThread extends Thread {
    @Override
    public synchronized void start() { //쓰레드 생성
        super.start();
    }
    @Override
    public void run() {  //쓰레드로 실행할 내용을 기술
        int[] arr = {95, 60, 85, 70, 90, 80};
        for(int i=0;i<arr.length;i++){
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("점수 : "+arr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}