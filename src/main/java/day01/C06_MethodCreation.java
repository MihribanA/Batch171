package day01;

public class C06_MethodCreation {
    public static void main(String[] args) {

        //Kare prizmanin hacmini bulan ve donduren bir method yaziniz
        int tabanKenar = 3;
        int yukseklik = 4;

        System.out.println(karePrizmaHacimBul(3, 4));
        System.out.println(karePrizmaHacimBul(tabanKenar, yukseklik));

    }

    public static int karePrizmaHacimBul(int tabanKenari, int yukseklik) {
        int hacim = tabanKenari * tabanKenari * yukseklik;
        return hacim;

    }

    int kenar = 5;
    int yukseklik = 6;

}
