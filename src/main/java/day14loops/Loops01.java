package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //verilen bir stringi ters ceviren kodu yaziniz..==> interviuv sorusu
        //"Java" ==>"avaJ"

        //1.yol
        String t = "Java";
        String ters = "";

        for (int i = t.length()-1; i >=0; i--) {
            ters = ters+ t.substring(i,i+1);//subsitring kullanirsak bize string verir.string+ ters
        }
        System.out.println(ters);

        //2.yol
        String u = "Java";
        String ters2 = "";
        for (int i = u.length()-1; i>=0; i--) {
            ters2= ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //ornek2: size verilen bir stringin "Palindrone" olup olmadigini kontrol eden kodu yaziniz.
        //nalan, ey edip adanada pide ye; 404
        //Logic: Stringi ters cevir sonrada duz halli ile ters halini karsilastir ayni ise "Palindrome" dir
        String duz = "ey edip adanada pide ye";
        String ters3= "";

        for (int i = duz.length()-1; i>=0; i--) {
            ters3= ters3 + duz.substring(i,i+1);
        }
        if(duz.equals(ters3)) {
            System.out.println(duz + "  : Palindrome dir");
        }else{
            System.out.println(duz + "  : Palindrome degil dir");

        }
    }
}
