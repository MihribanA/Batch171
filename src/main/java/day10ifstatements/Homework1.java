package day10ifstatements;

import java.util.Scanner;

public class Homework1 {
    /*HomeWork
   1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
   uygun mesaj veren kodu yaziniz
*/
    public static void main(String[] args) {

        Scanner password = new Scanner(System.in);
        System.out.println("Please enter your password");
       String pwd = password.next();

       if(pwd.equals("pwd123!")){
           System.out.println("Login successful");
       }else{
           System.out.println("Didn't enter the correct password");
       }

    }
}