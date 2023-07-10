package sec1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        //tot(총점), avg(평균), hak(학점), pan(판정), grd(등급)
        //총점 = 전산 + PG + OA
        //평균은 세 과목의 점수의 합계를 3으로 나눈 실수
        //학점은 평균이 96이상은 A+, 93이상은 A0, 90 이상은 A-
        //86이상 B+, 83이상 B0, 80이상 B-
        //76이상 C+, 73이상 C0, 70이상 C-
        //66이상 D+, 63이상 D0, 60이상 D-
        //나머지는 F
        //판정은 평균이 80이상이면서, 세 과목 모두 70 이상이면, "합격", 아니면, "불합격"
        //등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급...1이면 1등급
        //출력 형식
        //학번  전산  PG  OA  총점 평균 학점 판정 등급
        //xxx  xx   xx  xxx  xxx xx.xx xx xx x등급 \t 사용
        Scanner sc = new Scanner(System.in);

        System.out.println("학번 : ");
        int number = sc.nextInt();
        System.out.println("전산 : ");
        int a1 = sc.nextInt();
        System.out.println("PG : ");
        int a2 = sc.nextInt();
        System.out.println("OA : ");
        int a3 = sc.nextInt();

        int tot = a1 + a2 +a3;

        float avg = (float)tot/ 3;




    String hak = "";

        if( tot >=96){
            System.out.println("A+");
            hak = "A+";
        } else if (tot >=93){
            System.out.println("A0");
            hak = "A0";
        } else if (tot >=90){
            System.out.println("A-");
            hak = "A-";
        } else if (tot >=86){
            System.out.println("B+");
            hak = "B+";
        } else if (tot >=83){
            System.out.println("B0");
            hak = "B0";
        } else if (tot >=80){
            System.out.println("B-");
            hak = "B-";
        }else if (tot >=76){
            System.out.println("C+");
            hak = "C+";
        }else if (tot >=73){
            System.out.println("C0");
            hak = "C0";
        }else if (tot >=70){
            System.out.println("C-");
            hak = "C-";
        }else if (tot >=66){
            System.out.println("D+");
            hak = "D+";
        }else if (tot >=63){
            System.out.println("D0");
            hak = "D0";
        }else if (tot >=60){
            System.out.println("D-");
            hak = "D-";
        }else {
            System.out.println("F");
            hak = "F";
        }

        /*
         */
        /*
        int avg = (a1 + a2 + a3)/3 ;
        String hak = "";

        switch (avg) {
            case 96>=;
                hak = "A+";
                break;
            case 93>=:
                hak = "A0";
                break;
            case 90>=:
                hak = "A-";
                break;
            case 86>=:
                hak = "B+";
                break;
            case 83>=:
                hak = "B0";
                break;
            case 80>=:
                hak = "B-";
                break;
            case 76>=:
                hak = "C+";
                break;
            case 73>=:
                hak = "C0";
                break;
            case 70>=:
                hak = "C-";
                break;
            case 66>=:
                hak = "D+";
                break;
            case 63>=:
                hak = "D0";
                break;
            case 60>=:
                hak = "D-";
                break;
            case int avg <60:
                hak = "F";


                //break 생략가능
        }
       */



        String pan = "";
        if (tot >=80 && a1>=70 && a2>=70 && a3>=70){
            System.out.println("합격");
            pan = "합격";
        } else {System.out.println("불합격");
        pan = "불합격";}

        //등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급...1이면 1등급
        int grd = ((int) avg / 20);

        if (grd==5){
            System.out.println("5등급");
        } else if(grd ==4){
            System.out.println("4등급");
        }else if(grd ==3) {
            System.out.println("3등급");
        }else if(grd ==2) {
            System.out.println("2등급");
        }else if(grd ==1) {
            System.out.println("1등급");
        }

        System.out.printf("학번 %d 전산 %d  PG %d  OA %d 총점 %d 평균 %3.2f 학점 %s 판정 %s 등급 %s ", number, a1, a2, a3, tot,avg, hak, pan, grd );
    }
}
