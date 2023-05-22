package day13loops;

public class Loops03 {
    //ornek verilen bir string te kucuk harfleri konsola yazmayiniz.
    public static void main(String[] args) {
        //Pwd12?Ab ==> P12?A seklinde

        String s= "Pwd12?Ab";

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='a' && ch<='z') {
                continue;
            }else{
                System.out.print(ch);
            }
        }

    }
}
//note: Break ile continue arasindaki fark nedir?
//"break" ile switch parantezinin disina cikmak icin ve loop u kirmak icin kullanilir
//continue ise loop yaparken bazi istenen elemanlari isleme sokamam icin kullanilir.
// continue keywordu ile loop taki gecerli iterationu sonlandirir sizi increment/ dicrement