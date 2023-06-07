package day20statickeywordconstructors;

public class Student {
    /*
    1)Static veriable veya static method'lar (clas member(uye)) tum objeler icin ortak elemandir.
    2)static class memberlar uzerinde yapilen tum degisiklikler tum objeleri etkiler.
    3)static class memberlar class a non-static memberlar objelere monte edilir.
    Mesela; bir class dan 100 tane obje olusturdugunuzda non-static olanlar 100 kere olusturulur ama static
    olanlar object sayisindan bagimsiz olarak bir kere olusturulurlar.
    4)static class member lara ulasmak icin object olusturmaya gerek duyulmaz
    ama non-static class memebrlara ulasmak icin object olusturmak sarttir.
    5)static variable larin diger adi "class variable" dir
    non-static variable larin diger adi "instance variable" veya "object variable" dir.
     */

    public static String stdName="Tom Hanks";

    public int age=13;
    public static  void staticMethod(){
        System.out.println("Ben static methodum");
    }

    public  void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }



}
