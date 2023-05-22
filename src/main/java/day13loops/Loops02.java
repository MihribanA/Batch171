package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        //ornek2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan
        // karakterlerini buyuk harfe donusturen kodu yaz. ankara ==>AKR
        String s = "ankara";
        for ( int i=0 ; i<s.length() ; i++ ){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }
        //ornek3:verilen bir string te ilk a harfinden onceki tum karakterleri konsola yazdiriniz
        //I love Java ==> I love J

        String s1 = "I love Java";
        for ( int i=0 ; i<s1.length() ; i++){
            if(s1.charAt(i)=='a'){
                break;
            }
            System.out.print(s1.charAt(i));
        }
        //ornek4: verilen bir stringte son a dan sonraki tum karakterleri ters sirada yazdiriniz
        // germany ==> yn gibi
        System.out.println();
        String t ="Germany";
        for (int i=t.length()-1; i>=0  ; i--) {
            if(t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));


        }














    }
}
