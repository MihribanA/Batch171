package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //ornek: Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz

        //abc@gmail.com ==> gmail
        String a = "abc@gmail.com";
        int startingIndex= a.indexOf('@')+1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);// companyName=gmail

        //ornek2: verilen 2 string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali can";
        String i = "Ali Can";
        boolean result = h.equals(i);// h ici ile i ici ayni mi diye sordu burada
        System.out.println(result);// false


        //Javada Memory Kullanimi
        /*javada 2 tane memory vardir
        1) Stack Memory ==> small
        kucuk memory dir
        primitivleri ve non primitivlerin adreslerini tutar
        2) Heap Memory ==> huge
        buyuk memorydir
        non primitivlerin datalarini icerir.
        java heap memory de yerlestirilen tum non primitivller icin bir adres olustur ve bu adresi stack memory de saklar
         */

        /*
        stringlerin esitliklerini kontrol ederken cift esit yerine equals () methodu kullaniriz
        cunku ;== sembolu iki sitringi karsilastirirken hem adreslerine hem degerlerine bakar ikiside ayni ise esittir der.
        ama biz kod yazarken genellikle stringlerin adresleri ile ilgilenmeyiz. degerleri ile ilgileniriz.
        bu yuzden string karsilastirmalarinda == kullanmayiz.
        equals methodu ise iki sitringi karsilastirirken sadece degerleri ile ilgilenir. dolayisiyla degerleri ayni ise bu iki string esittir der.
        degerkler farkli ise bu iki string farklidir der. bu bizim kod yazarken ihtiyac duydugumuz seydir.
         */

        //ornek3: verilen iki stringin birbirinin aynisi olup olamdigini buyuk harf kucuk harf farki olmadan kotrol eden kodu yaziniz

        String j= "ali Can";
        String k= "Ali Can";
        boolean result3= j.equalsIgnoreCase(k);
        System.out.println(result3);// true
        //equalsIgnoreCase methodu buyukharf kucuk harfe dikkat etmeden kotrol eder.

        // bir string veriable olusturunuz ve bu stringteki rakam olamayan tum karakterlerin sayisini consola yazdiriniz
        // bir veriable olustur ve ilk karakter ile son karakter disindaki tum karakterleri konsola buyuk harfle yazdiriniz
        // bir veriable olustur ve bu stringteki ilk ve son karakterlerin ASCII degerlerini toplamini consola yazdirin
        //tek kelimelk bir sehir ismi olustur ve sehir isminin ilk harfini buyuk harf ile diger harfleri kucuk harfle konsolay yazdiriniz
        // asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        // en az 6 karakter olsun
        //en az bir tane buyuk harf olsun, en az bir tane kucuk harf olsun, en az bir tane rakam olsun



    }
}
