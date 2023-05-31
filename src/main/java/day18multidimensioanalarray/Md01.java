package day18multidimensioanalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Bir array in elemanlari array ise bu arrayler multidimensional array dir.
        //Multidimensional Array nasil olusturulur.

        int a[][]= new int [3][2];

        //Multidimensional Array lere eleman nasil eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //Multidimensional Array nasil yadirilir?
        System.out.println(Arrays.toString(a));//[[I@2f7c7260, [I@2d209079, [I@6bdf28bb]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        System.out.println(a[1][1]);//45
        System.out.println(a[2][1]);//0
        System.out.println(Arrays.toString(a[0]));//[5,12]
        System.out.println(Arrays.toString(a[1]));//[81,45]

        //Kisa yoldan multidimensional array nasil olusturulur?
        String students [][]= {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan,Kayahan"}};

        //ornek1: yukaridaki students arrayinde toplam kac isim oldugunu bulunuz.

        int sum=0;
        for(String[] w: students){
            sum=sum+w.length;

        }

        System.out.println(sum);//8
    }
}
