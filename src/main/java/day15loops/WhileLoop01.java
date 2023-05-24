package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        //kalibini olusturalim
        //for (baslangic degeri; loop calisma kurali; artirma/azaltma) {
        //   calisacak kodlar

        /*while kalibi
        baslangic degeri
        while (loop calisma kurali){
        caliscak kodlar
        artirma/azaltma
         */
        //ornek 3ten 6ya kadar tam sayilari console yazdiriniz
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //2.yol: while loop
        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //ornek2:23 ten 12 ye kadar cift sayilari koncola yazdiriniz.
        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();
        int l = 6;
        while (l <20) {
            if (l % 2 != 0) {
                System.out.print(l + " ");
            }
            l++;


        }

    }
}