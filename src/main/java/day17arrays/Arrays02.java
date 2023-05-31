package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek1: Kullanicinin coklu datayi bir array a yerlestirebilmesi ve istedigi zaman durdurabilmesi icin
        // gereken kodu yaziniz
        /*
        1)Kullanicidan data almak icin scanner olustur
        2)coklu datayi yerlestirmek icin bir array olusturmaliyiz
        3)Array olusturailmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisini giriniz");
        int numOfElements= input.nextInt();
        String stdNames[]= new String[numOfElements];

        System.out.println("ekleme islemini durdurmak icin 'q' ya basiniz");

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println((i+1) + " . ogrencinin ismini giriniz..");
            String name = input.next();
            if(name.equalsIgnoreCase("q")) {
                break;
            }else{
                stdNames[i]=name;
            }

        }

        System.out.println(Arrays.toString(stdNames));

    }
}
