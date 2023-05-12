package day_02;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan farenheit bir deger alalim.
        //scanner objesi olusturalim
        Scanner scan = new Scanner(System.in);
        //kullaniciya bir mesaj vermeliyiz
        System.out.println("Lutfen fahrenheit cinsinden bir sicaklik giriniz");
        double fahrenheit= scan.nextDouble();//kullanicinin girmis oldugu veriyi fahrenheit
        //kontenyirina koydum.
        double celsius = fahrToCels(fahrenheit);

        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius = " + celsius);

    }

    public static double fahrToCels(double fahrenheit) {
        // formul c= (f-32)/1.8
        double celsius =(fahrenheit-32)/1.8;
        return celsius;


    }
}
