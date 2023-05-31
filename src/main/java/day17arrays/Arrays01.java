package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //arrayleri kisa yoldan nasil olusturabiliriz?
        int arr[]= {63,19,313,353,7,100,4};
        System.out.println(Arrays.toString(arr));//[63, 19, 313, 353, 7, 100, 4]

        //ornek1: verilen arry de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz
        int sayac=0;
        for (int w:arr) {
            if(w%2==0){
                sayac++;
            }

        }
        System.out.println("Array de "+sayac+" adet cift sayi "+(arr.length-sayac)+" adet tek sayi kullanilmistir");

      //ornek2: size verilen bir string arraydeki isimlerden 5 karakterden az karakter icerenleri consola yazdiriniz
        String stdNames[]= new String[5];
        stdNames[0]="Ajda";
        stdNames[1]="Cuneyt";
        stdNames[2]="Tom";
        stdNames[3]="Ayhan";
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames));//[Ajda, Cuneyt, Tom, Ayhan, Filiz]

        for(String w: stdNames){
            if(w.length()<5){
                System.out.println(w);//Ajda,Tom
            }
        }


//ornek3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra "F"ile
        //baslayan isimler haric diger isimleri konsola yazdiriniz

        //note1: sort () methodu sayisal data type lari kucukten buyuge siralar.(ascending order)
        //note2: sort methodu String datalari alfabetik siraya koyar(alfabetical order)
        //note3: ascending order+ alfabetical order==> natural order
        //note4: sort methodu array elemanlarini natural order e gore siralar
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames){
            if(w.startsWith("F")){
                continue;//haric demek gibi dusunmeliyim
            }
            System.out.println(w);
        }













    }
}
