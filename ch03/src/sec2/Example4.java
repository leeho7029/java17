package sec2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        for(int a = 1; a<=5; a++){
            for(int b =1;b<=4;b++){
                System.out.print(b+"\t");
            }
            System.out.print("\n");
        }


        /*
        1 2 3 4 5 6 7
        8 9 10 11 12 13 14
        15 16 17 18 19 20 21
        22 23 24 25 26 27 28
        29 30 31
         */
        for(int a = 1; a<=5; a++){
            for(int b=1; b<=7;b++ ){
                int n = a;
                int c =b+(n-1)*7;
                if(c==32) break;
             System.out.print(c+"\t");
            }
            System.out.println("\n");
        }




        /*
        *
        **
        ***
        ****
        *****
         */
        for(int a = 1; a<=5; a++){
            for(int b= 1; b<=a;b++  ){
            System.out.print( "*" +"\t");
            }
            System.out.println("\n");
        }





        /*
        *****
        ****
        ***
        **
        *
         */

        for(int a=1; a<=5;a++){
            for(int b=5; b>=a;b--){
                int c = b*a;

                System.out.print( "*");

            }
            System.out.println();
        }




        /*
        구구단
        2x1=2   3x1=3 ...9x1=9
        .................9x2=18
        ........................
        2x9=18 ............9x9=81
         */
        for(int a=1; a<=9;a++){
            for(int b=2; b<=9;b++){

                System.out.printf("%dx%d=%2d\t", b,a,a*b);

            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();


       for(int k=1; k<=9;k++) {
            System.out.println( N + "*" + k+ "=" + (N*k));

        }
        System.out.println();



    }
}
