package day01;

public class C01_Veriables {
    public static void main(String[] args) {
        //veriable
        //sintax: data turu + datanin ismi = veriable degeri

        int yas = 36;
        int sayi = 50;
        System.out.println(yas);
        System.out.println(sayi);


        // sayi = 50 seklinde yazdir. yani etiketiyle birlikte yazdir demek.

        System.out.println("sayi=" + sayi);
        // soutv degiskeni etiketiyle birlikte yazdirma islemi yapar.

        // String bir data olusturalim ==> non primitive
        String isim= "Ali";
        System.out.println("isim=" + "Ali");
        
        //Olusturdugun veriable i farkli bir veriable a kopyala
        int benimYas= yas;
        System.out.println("benimYas = " + benimYas);
        
        //ayni satirda coklu veriable deklare et
        int yil = 2023,ay=4, gun=21;
        System.out.println("yil = " + yil);
        
        //Bir veriable degerini guncelle
        yil=2024;
        System.out.println("yil = " + yil);

        // bir veriable deklare et: x
        double x;
        //bir veriable baslat :y (initialize)
        double y= 12.5;
        //baska  bir veriable baslat : z degeri 33 olsun
        double z= 33;
        // x degiskenini y degiskeni ile baslat
        x=y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //veriable y i guncelle 14.9 olarak guncelle
        y=14.9;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
                
    }


}
