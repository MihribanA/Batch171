package day14loops;

public class Loops02 {
    public static void main(String[] args) {


        //ornek1: 5ten 8e kadar tam sayilarin toplamini veren kodu yaziniz.
        //5+6+7+8==>26

        int sum = 0; // toplama isleminin etkisiz elamanini sepete koyduk simdi digerlerini ekleyecegim sepete
        for (int i = 5; i < 9; i++) {
            sum = sum +i;
            //eger buraya sout(sum) yaparsak tek tek yaptigi adimlari gormus oluruz
        }
        System.out.println(sum);

        //ornek2: 7den 9 a kadar tam sayilari carpimin i veren kodu yaziniz
        int sum1 = 1;
        for (int i = 7; i < 10; i++) {
            sum1= sum1*i;
        }
        System.out.println(sum1);



        //ornek3:verilen bir tam sayinin rakamlari toplamini bulan kodu giriniz
        //578==> 5+7+8=20
         int toplam = 0;  // int n= -578 olsaydi n=math.abs(n); yaparsak mutlak deger icine almis olduk
        for (int i = 578; i>0 ; i=i/10) {
            toplam= toplam +i%10;
        }
        System.out.println(toplam);
        }

    }
