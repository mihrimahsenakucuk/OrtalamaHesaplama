
import java.util.Scanner;

public class OrtalamaHesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("2.sayıyı giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("3.sayıyı giriniz");
        int sayi3 = scan.nextInt();

        System.out.println("4.sayıyı giriniz");
        int sayi4 = scan.nextInt();

        int toplam = sayi1 + sayi2 + sayi3 + sayi4;
        double ortalama = toplam / 0.4;

        System.out.println("Sayıların ortamalası: " + (sayi1 + sayi2 + sayi3 + sayi4) / 4);


    }
}
