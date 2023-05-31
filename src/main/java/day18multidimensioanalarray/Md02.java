package day18multidimensioanalarray;

public class Md02 {
    public static void main(String[] args) {
        String students [][] ={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        // Ornek : Yukaridaki students arrayinde icinde "m" olan isimleri console a yazdiriniz

        for(String[] w : students){
            for(String k : w){
                if(k.contains("m")){
                    System.out.println(k);
                }

            }

        }

        //ornek2: bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        int num[][]={{5,4},{2,3,2},{7}};

        int result=1;

        for(int [] w: num){
            for(int c : w){
                result=result*c;

            }
        }

        System.out.println(result);


















    }
}
