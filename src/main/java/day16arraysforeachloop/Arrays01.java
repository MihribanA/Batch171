package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a= 13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //ama biz cide yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur.
        //Array ler diger collectionlardan cok cok daha hizlidir.(superfast da derler)
        //Array ler diger collectionlardan daha az memory kullanilar.


        //Array nasil olusturulur?
        String stdNames[]=new String[5]; //bu bir kalip
        System.out.println(Arrays.toString(stdNames));// konsola bu sekilde yazdirilirlar

        //Array e eleman ekleme nasil yapilir?
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[0]="Ekim";
        stdNames[1]="Mihriban";
        System.out.println(Arrays.toString(stdNames));

        //Arrayden spesifik bir elemani nasil aliriz?
        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);
        System.out.println(stdNames[0]);

        //ornek1: Arrydeki her elemanin sonuna unlem isareti koyarak yazdiriniz
        //length() stringlerde method (parantezli), arraylerde ise parantezsiz yazilir.(method degil)

        for (int i = 0; i <stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");
        }




    }
}
