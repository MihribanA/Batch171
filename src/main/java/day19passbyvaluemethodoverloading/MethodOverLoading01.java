package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        add(3, 5);
        
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
/*
   1)method overloading yaparken ismi degistirilmez
   2)Method overloading yaparken parametreler degistirilir
   a) Parametreleri degistirirken parametrelerin data type larini degistirilebilir
   b)Parametre degistirirken parametre sayisi degistirilebilir
   c)Parametre degistirirken, parametrelerin data typelari farkli ise yerleri degistirilebilir.
   3)Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir.
      bu yuzden ismi ve parametre "Method Signature" olarak adlandirilir

    4)Method Overloading olustururken return typi degistirmenin hicbir etkisi yoktur.
    Method Overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
    Method Overloading olustururken method u static yada non-static yapmanin hicbir etkisi yoktur
    Method Overloading olustururken bodyi degistirmenin hicbir etkisi yoktur

    5) "private" methodlar overload edilebilir. Cunku method overloading sadece bir class icinde olur
    private olmak ise baska classlara gidildiginde problem olusturur.

    6) static methodlar overload edilebilir,
    overloading yapmak icin (method ismini degistirmeden) method signature i degistiririz,
    dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static olmasi birseyi degistirmez
     */


