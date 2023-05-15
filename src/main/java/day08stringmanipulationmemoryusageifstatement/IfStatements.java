package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //if statements
        //bazi kodlari bazi sartlara gore aktive edebilmek icin if statements kullanilir.
        // if eger demek ==> if cumlesi

        //if you study hard, you will learn Java
       /* if(you study hard){
        you will learn Java
        }
    */
        //Ornek 1 sayi pozitif ise ekrana yazdir

        int num = 13;
        if (num>0){
            System.out.println(num+ "==> pozitiftir");
        }
        //ornek2: sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz
        int n =5;
        if(n>-1 && n<10){
            System.out.println("Rakam");
            //-1<n<10 olmaz ==> n>-1 &&  n<10 seklinde yazilir.`
        }
    }
    }
