package day08stringmanipulationmemoryusageifstatement;

public class StringManipilation01 {
    public static void main(String[] args) {
        //Bir string in hic karakter icermedigini yani bos string oldugunu kontrrol eden kodu yaziniz.
        //1.yol length() metodu ile cozum
        String str = "";
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);

        //2.yol
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ?" + result2); // is Empty ? true
        // (empty kullanmak daha iyi cunku bunun icin olusturulmus)

        //ornek 2: bir stringin space haric hicbir karakter icermedigini kontrol eden bir karakter yaziniz.
        //1.yol
        String t = "      ";
        boolean result3=t.replace(" ","").length()==0;
        System.out.println(result3);

        //2.yol
        boolean result4=t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3.yol
        boolean result5=t.isBlank();
        System.out.println(result5);
        //isBlank metodu sadece space iceren stringler icin tru verir
        //space disinda bir karakter varsa false verir.

        //ornek3: bir string de a,i,e karakterlerinin ilk gorunumlerinin indeksleri toplamini ekrana yazdiriniz
        //"Java is easy to learn"
        // 0123456789... ==> 1+5+8=14
        String r ="Java is easy to learn";
        int idxA =r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println(idxA+idxE+idxI);

        //ornek4: bir stringteki "Java" kelimesinin ilk olrak kacinci index te kullanildigini gosteren kodu yaz
        //"Ah Java vah Java sensiz olmuyor Java"
        String u = "Ah Java vah Java sensiz olmuyor Java";
        int idxJava=u.indexOf("Java");
        System.out.println(idxJava);// 3 (ilk javanin j si 3. indekste)

        int idxjava=u.indexOf("java");
        System.out.println(idxjava); // -1 olur cunku java yok. aranan index yoksa -1 doner

        //ornek5: Bir string de a,i,e karakterlerinin son gorunumlerinin indeksleri toplamini ekrana yazdiriniz
        String v = "Java is easy to learn"; // 5+17+18=40
        int idxOfa=v.lastIndexOf('a');
        System.out.println(idxOfa);//18

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);//17

        int idxOfi=v.lastIndexOf('i');
        System.out.println(idxOfi);//5

        System.out.println(idxOfa+idxOfi+idxOfe);//40


    }
}
