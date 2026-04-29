import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
          Sayısal
          Sözel
          Mantıksal
        * */

        byte stokAdedi = 127;
        short stokKodu = 32767;
        int urunId = 2_000_000_000;
        long buyukBirTamSayi = 2_000_000_000_000L;

        double fiyat = 1.99;
        float angle = 0.65f;

        float f1 = 0.1f;
        float f2 = 0.2f;

        double d1 = 0.1;
        double d2 = 0.2;


        char paraBirimi = '$';

        System.out.println(f1+f2);
        System.out.println(d1+d2);

        boolean izinVarMi = true;

        //Implicit: otomatik, kapalı ve güvenli.
        int sayi = 50;
        double ondalik = sayi;
        System.out.println(ondalik);

        byte minik = 10;
        int minikTamSayi = minik;

        //Explicit: zorla dönüştürme - daraltma
        double pi = 3.99;
        int piInt = (int)pi;
        System.out.println(piInt);

        int sayi2 = 256;
        byte b = (byte) sayi2;
        System.out.println(b);
        //                       0.        1.    2.        3.
        String[] mevsimler = {"Sonbahar","Kış","İlkbahar","Yaz"};
        System.out.println(mevsimler[0]);
        System.out.println(mevsimler[mevsimler.length-1]);

        String[] onlar = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        String[] birler = {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("İki basamaklı bir sayı giriniz:");
        int okunacakSayi = scanner.nextInt();
        int onlarBasamagi = okunacakSayi /10;
        int birlerBasamagi = okunacakSayi % 10;

        System.out.println(onlar[onlarBasamagi]+" "+birler[birlerBasamagi]);





    }
}