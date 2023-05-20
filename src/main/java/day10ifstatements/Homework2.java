package day10ifstatements;

import java.util.Scanner;

public class Homework2 {
    /* 2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
    Pazar ==> 1. gun , Pazartes ==> 2. gun...*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day name");
        String day = input.next();

        if(day.equalsIgnoreCase("Sunday")){
            System.out.println("1");
        } else if (day.equalsIgnoreCase("Monday")) {
            System.out.println("2");
        }else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("3");
        }else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("4");
        }else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("5");
        }else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("6");
        }else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("7");
        }else {
            System.out.println("Enter the name of day");
        }


    }

}
