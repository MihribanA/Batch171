package day_02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
                 A
                A A
               A A A
               olusturunuz
         */
        Scanner girdi =  new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = girdi.next().charAt(0);// burada 0. index demek
        //stringlerde index yapisi vardir ve sifirdan baslar
        System.out.println("ch = " + ch);
        System.out.println("======================================");

        /*
           A
          A A
         A A A
        */

        System.out.println("  "+ch+ "  ");
        System.out.println(" "+ch+" "+ch +" ");
        System.out.println(ch+ " "+ ch+ " "+ ch);

        //tek sout ile yapmak istersem \n ile yapariz. islemci bir alt satira gecirir
        System.out.println("  "+ ch+ "  \n "+ch+ " "+ch+" \n"+ ch+" "+ch+" "+ch);

    }
}
