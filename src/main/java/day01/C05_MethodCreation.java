package day01;

public class C05_MethodCreation {
    public static void main(String[] args) {
        // iki sayinin karelari toplamini bulan ve yazdiran bir method olusturunuz

        // 3 ve 5 ==>  34 yazdirsin
        // methodum sadece yazdirma islemi yapacak bu yuzden return type void olacak

        kareTopla(3,5); //argument denir buna
        kareTopla(10,100);
        kareTopla(4,9);

    }

    public static void kareTopla(int sayi1, int sayi2) //parametre diyoruz ve burada deklare ettigimiz veriableler
                                                        // method body kisminda kullanilabilir
    {

        int sonuc=sayi1*sayi1+sayi2*sayi2;
        System.out.println(sonuc);
    }

}
