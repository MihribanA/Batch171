package day09ifStatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //ornek kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num =input.nextInt();
        //1.yol
        if (num%2==0) {
            System.out.println("cift sayidir");
        }
        if (num %2!=0){
                System.out.println("tek sayidir");
            }
        //2.yol
        if(num%2==0){
            System.out.println("cift sayidir");
        }else{
            System.out.println("tek sayidir");
        }
        }
    }

