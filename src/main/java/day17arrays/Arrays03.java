package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yazniniz
        String names []= {"K", "C","R","A", "S"};
        String el= "R";

        //1. way
        int counter = 0;
        for (String w : names){
            if(w.equals(el)){
                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("Array has "+el);
        }else{
            System.out.println("Array doesn't have "+ el);
        }

        //2.way: binarySearch() methodu hizli calisir
        /*
        1)binarySearch metodunu sort kullanmadan kullanmayiniz, cunku binarySearch mantigi sirali elemanlar icin gecerli
        2)bu methodda var olan elemanlar icin size o elemanin index ini verir
        aldigimiz index 0 veye 0dan buyuk ise o eleman var demektir.
        3)bu method olmayan elemanlar icin negatif tam sayi degeri verir.
        "-" isaretinin anlami o eleman yok demektir
        - nin yanindaki sayi ise o eleman olsaydi kacinci eleman olurdu demektir.
         */

        Arrays.sort(names);
        int result= Arrays.binarySearch(names,el);
        System.out.println(result);

        if(result<0){
            System.out.println("Array doesn't heve "+ el);
        }else{
            System.out.println("Array has "+ el);
        }
        int num1= Arrays.binarySearch(names,"A");
        System.out.println(num1);//0 ==> var hemde indexi sifir

        int num2=Arrays.binarySearch(names,"K");
        System.out.println(num2);//2==> var hem de indexi 2

        int num3=Arrays.binarySearch(names,"U");
        System.out.println(num3);//-6 ==> "-" bu eleman yok demek
        //"6"==> ise olsaydi  6. eleman olurdu demek



















    }
}
