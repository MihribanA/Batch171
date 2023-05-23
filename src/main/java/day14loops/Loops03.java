package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
         /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14  */
        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz..");
        int start = input.nextInt();

        System.out.println("Bitis degerini giriniz..");
        int end = input.nextInt();
        if(start>end){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }else {

            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");

                }
            }
        }
        //ornek2:hic sayi kullanmadan 1den 100 ekadar olan sayilari console yazdiriniz.
        for (int i= 'd'/'d'; i<='d' ; i++){
            System.out.print(i+ " ");
        }
//int d ='d';
        //sout (d) yaparsak ascii degeri verir bize google yapmak zorunda kalmazsin
        }
/*
note1: Bazi loop lar sonsuz defa calisabilir, Bu tarz looplara infinite (sonsuz) loop denir
        bu looplara genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir

        note2: loop olusturdugumuzda ortayi bos birakirsak sonsuz olur.
 */
    }

