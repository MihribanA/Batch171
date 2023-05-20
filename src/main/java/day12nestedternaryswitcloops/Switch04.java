package day12nestedternaryswitcloops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch04 {
    //Kullanicidan bir ulke ismi aliniz Alinan ulke isimlerine gore kisaltmalari yaziniz.
    //   Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
    //            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ulke ismini giriniz");
        String ulke= input.nextLine().toLowerCase();
        switch (ulke){
            case"america":
                System.out.println("US");
                break;
            case"england":
                System.out.println("UK");
                break;
            case"germany":
                System.out.println("DE");
                break;
            case"turkey":
                System.out.println("TR");
                break;
            case"india":
                System.out.println("IN");
                break;
            case"peru":
                System.out.println("PE");
                break;
            case"spain":
                System.out.println("ES");
                break;
            case"bulgaria":
                System.out.println("BG");
                break;
            case"france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ulke tanimli degildir" );

        }

    }
}
/*Github ta bulunan projeyi kendi lokalimize almak icin;
a)Clone lamak istenen projenin url i kopyalanir.
b)Intellijden file+new+project+project from version control
c)bundan sonra kodalari git pull denilerek kendi lokalimize cekebiliriz

2) kendi lokalimize almis oldugumuz projeyi Github ta saklamak istersek :
a)github ta yeni bir repo olusturmaliyiz,reponun url sini kopyala
b)intelijde gondermek istediginiz proje acik iken terminalden
git push yazip url yi yapistir enter
 */