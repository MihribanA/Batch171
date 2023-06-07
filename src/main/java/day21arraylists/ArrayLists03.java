package day21arraylists;

import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur?
        List<Character> initials= List.of('a','c','d','k');
        System.out.println(initials);//[a,c,d,k]
        initials.add('b');
        System.out.println(initials);//[a,c,d,k]
        //initials.add('b');
        //initials.set(0,'u');
        //initials.indexOf('a'));

        //List.of () methodu degistirilemez bir list olusturmak icin kullanilir.
        //bu nedenle list uzerinde degisiklik yapmaya yonelik methodlari desteklemez ama
        // diger list methodlari kullanilabilir.

        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun indexini verir.
        int r1= initials.indexOf('k');
        System.out.println(r1);//3

        //lastindexOf(aranan karakter) methodu aranan karakterin son gorunumunun indexini verir.
        int r2= initials.lastIndexOf('a');
        System.out.println(r2);//2
    }
}
