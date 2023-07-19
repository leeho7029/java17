package sec1;
//쓰레드(Thread) : 하나의 작업(Task) 또는 하나의 실행 프로그램(process)
//Multi Thread : 여러 개의 쓰레드를 동시에 진행 또는 실행할 수 있도록 한 실행 환경
//Op-code(명령어 코드) : Operand(데이터가 있는 주소) => Stack(스택)에 보관되어 처리
//여러 일을 처리하려면 일의 순서를 정해야 함 -> 스케줄링
//생성(create) -> 실행대기(wait) -> 실행(Run) -> 선점대기(Blocking) -> 재실행(WakeUp) -> 종료(complete)

public class Thread1 {
    public static void main(String[] args) {
        int[] arr = {95, 60, 85, 70, 90, 80};
        String[] str = {"가","나","다","라","마","바"};
        for (int i=0; i<arr.length;i++){
            System.out.println("이름 : " + str[i]); //전체 single Thread 쓰레드는 6개
            try {
                Thread.sleep(1000);
                //대기 시간 부여하고, 지정한 밀리초만큼 wait되며, 그 시간이 지나면 자동으로 wake up된다
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
