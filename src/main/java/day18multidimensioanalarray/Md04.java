package day18multidimensioanalarray;

public class Md04 {
    public static void main(String[] args) {
        //ornek: Bir integer multi dimensional arraydeki en kucuk ve en buyuk elemenalrin toplamini bulunuz
        int ages[][]= {{15,4},{12,43,21}}; // 4+43=47
        int small= ages[0][0];// sepette 15 var demek

        for(int[] w : ages){
            for (int k: w){
                small= Math.min(small,k);
            }
        }

        System.out.println(small);

int max = ages [0][0];
for(int[] w: ages){
    for(int k : w){
        max = Math.max(max,k);
    }
}

        System.out.println(max);
        System.out.println(small+max);
    }
}
