package day15loops;

import java.util.Scanner;

public class NestedLoop {
    /*                Example 1: Asagidaki sekli cizen kodu yaziniz
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini (row) giriniz..");
        int row= input.nextInt();

        for (int i = 1; i <=row; i++) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }


    }
}