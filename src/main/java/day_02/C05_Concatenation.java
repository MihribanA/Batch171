package day_02;

public class C05_Concatenation {
    public static void main(String[] args) {
        //SELIM isminin icerisinde bulunan harfleri kullanmadan yazdiriniz
        /*ascii table kullaniniz
          S=83
          E=69
          L=76
          I=73
          M=77
         */
        char  s=83; // char buradan anladi ascii sayisi oldugunu.
        char e= 69;
        char l= 76;
        char i = 73;
        char m = 77;
        //char verilerin arasinda + islemi varsa int bunu sayisal toplar ve 378 cikar
        //o yuzden basina hiclik "" koymaliyiz
        // hiclik string bir ifadeddir. string ile neyi toplarsak toplayalim sitring olur.

        System.out.println(""+s+e+l+i+m);



    }
}
