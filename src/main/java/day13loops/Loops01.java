package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //ornek1: Ekarana 5 kere "Hi" yazdiriniz.
        //1.yol tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        Code Standarts
        1)tekrar (Repetition) olmamalidir
        2)Dynamic olmalidir
        3)Tamir (Fix) ve update kolay yapilabilmelidir.
         */
        //2.yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //dort tane loop var:a)for-loop b)while-loop c)do-while-loop d)for-each loop

        //a) for - loop
        /*
        for ( Baslangic degeri   ; Loop un calisma sarti  ; Artirma/eksiltme ){
        calisacak kodlar }
         */

        for( int i= 1            ;    i<6                  ;       i++            ) {
            System.out.println("Hi..");
        }

            //ornek2:11 den 14 e kadar tum sayilari ekrana yazdiran kodu yaziniz
            for( int i =11;  i<15;  i++){
                System.out.println(i);
            }
            //ornek3: 40 tan 23 e kadar tum cift sayilari ekrana yazdiriniz
        for( int i=40; i>22 ; i--){
            if(i%2==0){//i nin 2 ile bolumunden kalan sifir ise yazdir demek
            System.out.print(i+ " ");}//printin yanindan ln yi kaldirdik ve arada bosluk biraktik yan yana yazdirdik
        }

        //ornek 4: 18den 56 ya kadar tum tek sayilari yazdir
        System.out.println();
        for ( int i = 18; i<56; i++){
            if(i%2!=0){
                System.out.print(i + " ");
                System.out.println();

            }
        }

//ornek:21 den 180e kadar hem 2 hem 3 ile bolunebilen sayilari ekrana yazdir
        for(int i = 21 ; i<181 ; i++){
            if(i%2==0 && i%3==0){
                System.out.print(i + " ");
            }
        }



    }
}
