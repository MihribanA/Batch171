package day11nestedifternaryincrementdecrement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Ternary Statement
        //ornek1:sayi 10 dan kucuk ise consola "kucuk" degil ise "kucuk degil" yazdir
        int num = 13;

        if (num < 10) {
            System.out.println("kucuk");
        } else {
            System.out.println("Kucuk degil");
        }
        //........ternary cozumu.......
        //condition    ?      condition true ise calisir  :  condition false ise calisir :
        String sonuc = num < 10 ? "Kucuk" : "Buyuk";
        System.out.println(sonuc);


        //ornek2:sayi cift ise "cift" tek ise "tek " yazdirin

        int k = 13;
        if (k % 2 == 0) {
            System.out.println("cift");
        } else {
            System.out.println("tek");
        }

        String result = k % 2 == 0 ? "cift" : "tek";
        System.out.println(result);


        //ornek3: sayi sifirdan buyuk ise "pozitif" kucuk ise " pozitif degil" yaziniz

        int sayi = 15;
        System.out.println( sayi>0 ? "pozitif" : "pozitif degil");


        //ornek4: kullanicidan iki sayi aliniz, buyuk olmayan (yani kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1. yol if else
        if(a<b) {
            System.out.println(a);
        }else{
            System.out.println(b);
        }


        //2.yol ternary
        double result2= a<b ? a  :  b ;
        System.out.println(result2);
    }
}