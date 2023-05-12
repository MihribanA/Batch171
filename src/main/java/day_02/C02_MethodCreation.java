package day_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen ikinci sasiyi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("swaptan once sayi 1 " + sayi1);
        System.out.println("swaptan once sayi 2 = " + sayi2);

        swaplaYazdir(sayi1,sayi2);



    }

    private static void swaplaYazdir(int sayi1, int sayi2) {
        int bosKap=sayi1;
         sayi1 =sayi2;
         sayi2 =bosKap;
        System.out.println("swaptan sonra sayi 1 = " + sayi1);
        System.out.println("swaptan sonra sayi 2 = " +sayi2);

    }


}
