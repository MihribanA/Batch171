package day12nestedternaryswitcloops;

public class NestedTernary01 {
       /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
 */
       public static void main(String[] args) {
              int year = 1600;
              String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not Leap") : (year % 4 == 0 ? "Leap" : "Not Leap");
              //ciktilar string oldugu icin string sepetine koyduk
              System.out.println(result);
       }
}