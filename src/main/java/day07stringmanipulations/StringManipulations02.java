package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /* password yazalim
        1)En az 8 karakter olsun
        2) Space karakteri olmasin
        3) En az bir buyuk harf olsun
        4) En az bir kucuk harf olsun
        5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //en az 8 karakter olsun
        boolean first=pwd.length()>7;
        System.out.println("En az 8 karakter var mi?" + first);
        
        //Space karakteri olmasin
        boolean second= !pwd.contains(" ");
        System.out.println("second = " + second);
        
        //En az bir buyuk harf olsun (sedece bir yolu var)
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        //buyuk harf disindaki herseyi sildik ve geride kalan harflerin 0dan buyuk mu olduguna baktik.
        //methodlari ayni satirda yan yana kullanmaya method chain denir.
        System.out.println("third = " + third);
        
        //En az bir kucuk harf olsun
        boolean fourth= pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourth = " + fourth);

        //En az bir rakam olsun
        boolean fifth= pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        System.out.println(("password gecerli mi?= " + (first && second && third && fifth)));

        // en sonunda sifrenin gecerli olup olamdigini kontrol ettik.hepsi true olmaliki gecerli olsun

        



    }
}
