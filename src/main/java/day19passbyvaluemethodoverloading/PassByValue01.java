package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //note: Java "pass by value" sayesinde variable larin orjinal degerlerini korur
        int shirtPrice=100;

        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran",shirtPrice));//80

        System.out.println(shirtPrice);//100

    }
    //Discount Methodunu Olusturalim
    public static int discount(String type, int price){
        switch (type){
            case "student":
                price-=10;
                break;
            case "veteran":
            price-=20;
            break;
            case "senior":
            price-=5;
            break;
            default:
                price=price;
        }
        return price;//price yi cagrildigi yere geri dondur demek return etmek
    }
    /*
    Pass By Value:
    1) Java  "pass by value" kullanir
    2) Yani; java methodlarin orjinal degeri degistirmesine musaade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur. ve o kopyayi method a yollar
        Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16

    Pass By Reference:
    1) Pass by Reference da method a reference yollanir
    2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistir.
    Bu yuzden "C#" gibi Pass By Reference kullanan dillerde method variable in orjinal degerini degistirir.
 */
}
