package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //soru1: rakam olmayan tum karakterlerin sayisini konsola yazdiriniz.
        String s1= "Sondan basa sayiniz 543210..";
        int ilkSoru= s1.replaceAll("[0-9]","").length();
        System.out.println(ilkSoru);

        //soru2:bir veriable olustur ve
        // ilk karakter ile son karakter disindaki tum karakterleri konsola buyuk harfle yazdiriniz
        String s2 = "her sey guzel olacak";
        String ikinciSoru= s2.substring(1,s2.length()-1).toUpperCase();
        System.out.println(ikinciSoru);

        //soru3:// bir veriable olustur ve bu stringteki ilk ve son karakterlerin
        // ASCII degerlerini toplamini consola yazdirin
        String s3 = "Gunaydin yasamak";
        char ucuncuSoruIlk= s3.charAt(0);
        char ucuncuSoruSon = s3.charAt(s3.length()-1);
        System.out.println(ucuncuSoruIlk+ucuncuSoruSon);

        //soru4://tek kelimelk bir sehir ismi olustur ve sehir isminin
        // ilk harfini buyuk harf ile diger harfleri kucuk harfle konsolay yazdiriniz
        String s4 = "burSA";
        char ilkHarf= s4.toUpperCase().charAt(0);
       String gerisi= s4.toLowerCase().substring(1);
        System.out.println(ilkHarf+gerisi);

        //soru5:en az 6 karakteri, en az bir tane buyuk harf,kucuk harf ve rakami olan sifre yaz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifre olusturunuz");
        String password = input.next();
        boolean min6=password.length()>5;
        System.out.println("en 6 karakter var mi?" + min6);
        boolean buyukHarf =password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("en bir tane buyuk harf var mi? " + buyukHarf);
        boolean kucukHarf = password.replaceAll("[^a-z]","").length()>0;
        System.out.println("en az bir kucuk harf var mi? " + kucukHarf);
        boolean rakam = password.replaceAll("[^0-9]","").length()>0;
        System.out.println("en az bir rakam var mi? " + rakam);
        System.out.println("Sifre gecerli mi?= " + (min6 && buyukHarf && kucukHarf && rakam));






    }
}
