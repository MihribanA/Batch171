package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanicidan aldiginiz iki sayinin karelarinin
    // birbirine esit olup olmadigini kotrol eden bir method yazdirin
    public static void main(String[] args) {
        Scanner esitMi = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int x = esitMi.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int y = esitMi.nextInt();
        boolean sonuc= kareleriEsitMi(x,y);
        System.out.println("sonuc = " + sonuc);
        
    }

    private static boolean kareleriEsitMi(int x, int y) {
        
        boolean sonuc= x*x == y*y;
        return sonuc;
    }


}
