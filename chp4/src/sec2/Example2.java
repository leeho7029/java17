package sec2;

public class Example2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[][] arr2 = {{10, 20, 30,}, {40, 50, 60}, {70, 80, 90}, {20, 40, 60}};
        int[][][] arr3 = {{{10, 20}, {30, 40}, {10, 20}}};


        System.out.println(arr2.length); //줄만 셈

        for (int i = 0; i < arr2.length; i++) {  //줄
            for (int j = 0; j < arr2[0].length; j++) {  //칸
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("--------------------------------");

        for (int i = 0; i < arr3.length; i++) {  //면
            for (int j = 0; j < arr3[0].length; j++) {  //줄
                for (int k = 0; k < arr3[0][0].length; k++) { ///칸
                    System.out.print(arr3[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("--------------------------------");
        }
    }
}