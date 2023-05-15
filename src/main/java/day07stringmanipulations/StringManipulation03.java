package day07stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {
        //ornek 1: bir stringin bas ve sonunda space karakteri varsa siliniz.
        // trim() methodu bas ve sondaki karakterleri siler ortadaki space lere dokunmaz.
        String s = " Ali can ";
        System.out.println(s);
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //ornek 2: asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        String tv = "$456.99";
        String laptop = "$875.99";
        String tv2=tv.replace("$","");
        System.out.println(tv2);

        String laptop2 = laptop.replace("$","");
        System.out.println(laptop2);

        Double totalPrice=Double.valueOf(tv2)+ Double.valueOf(laptop2);
        System.out.println("$"+totalPrice);

        //ornek3:Verilen ismi ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz

        String name = " Ali Can ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+first+last);

        //trim bastan ve sondan bosluklari kesiyor
        //touppercase hepsini buyuk harf yapiyor
        //split ortadan ikiye kesiyor kestigi yeri siliyor
        //bolunce ali [0] oldu can [1] oldu ondan 1 i aldik.
        //charAt (0) yazinca can in C sini  almis olduk.












    }
}
