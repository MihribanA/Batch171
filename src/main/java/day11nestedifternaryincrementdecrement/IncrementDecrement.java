package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //increase : artirmak demek,
        int a= 5;
        //a=a+2  ==> a+=2

        a+=2;
        System.out.println(a);
        a+=2;
        System.out.println(a);

        //ornek : bir tane integer variable olusturun ve onu iki sekildede 5 arttirin
        int b = 10;
        b= b+5;
        System.out.println(b);
        b += 5;
        System.out.println(b);



        //Decrement
        int c= 8;
        c=c-3;
        System.out.println(c);
        c-=3;
        System.out.println(c);


        int d = 6;
        d= d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);

        int e= 24;
        e=e/2;
        System.out.println(e);
        e/=2;
        System.out.println(e);

        //"1" ile increment i cok kullaniriz
        int f = 12;
        f++;
        System.out.println(f);

        int h= 10;
        h--;
        System.out.println(h);

        //"post-increment"  ve "pre-increment"
        int i = 10;
        int k= i++;
        System.out.println(k);//10 ==> i arttirilmadan k ya konuldugu icin k nin degeri 10 olur
        System.out.println(i);//11 ==> i satir sonunda artirildigi icin i nin degeri 11 olur

        int m= 15;
        int n= ++m;
        System.out.println(m);//16
        System.out.println(n);//16

        //Ornek
        int p = 17;
        int r = p--;

        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;

        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19


        /*
        1)Increment artirmak demektir, decrement azaltmak demektir.
        2) Increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilabilir
                a)i=i+5;
                b)i+=5;
                c)eger 1 ile artirma ==> i++
                note:bu c sikki sadece 1 artirmak icin kullanilir

                a)i=i-5;
                b)i-=5;
                c)eger 1 ile azaltma ==> i--
                note:bu c sikki sadece 1 azaltmak icin kullanilir

         */


    }
}
