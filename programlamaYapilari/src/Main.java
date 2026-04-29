import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        double fiyatToplam = 250;
        boolean kargoUcretsizMi = fiyatToplam >= 200;//<,>,<=,>=,==, !=
        System.out.println("Kargo ücretsiz mi: "+ kargoUcretsizMi);

        int a = 5;
        int b = 9;

        boolean herIkisidePozitifMi = (a>0) && (b>0);
        boolean enAzBiriPozitifMi = (a>0) || (b>0);
        boolean aNegatifmi = !(a>0);

        int sayac =0;
        sayac += 5;

        System.out.println("++X (prefix): "+ ++sayac);
        System.out.println("X++ (postfix): "+ sayac++);
        System.out.println("X : "+ sayac);

        System.out.println("Aşağıdaki trafik ışıklarından birini seçin:");
        System.out.println("1. Kırmızı");
        System.out.println("2. Sarı");
        System.out.println("3. Yeşil");

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        if (secim == 1){
            System.out.println("DUR!");
        } else if (secim == 2) {
            System.out.println("DİKKAT!");
        } else if (secim ==3) {
            System.out.println("GEÇ!");
        }
        else {
            System.out.println("Böyle bir seçenek yok");
        }

        switch (secim){
            case 1:
                System.out.println("DUR!");
                break;
            case 2:
                System.out.println("DİKKAT!");
                break;
            case 3:
                System.out.println("GEÇ!");
                break;
            default:
                break;

        }

        int deneme = 3;
        System.out.println("Lütfen şifrenizi girin:");
        String sifre = scanner.next();

       while (!sifre.equals("Java123") && deneme>0){
            System.out.println("Hatalı şifre. Kalan hak:"+ (deneme--));
            System.out.println("Lütfen şifrenizi girin:");
            sifre = scanner.next();
        }

       String yeniSifre ="";
       int hak = 3;
       do {
           System.out.println("Lütfen şifrenizi girin: " + hak + " hakkınız var." );
           yeniSifre = scanner.next();
           hak--;
       }while (!yeniSifre.equals("Java123") && hak>0);

       String[] urunler = {"Tişört","Şort","Şapka"};
       double[] fiyatlar = {500, 750, 400};

        for (int i = 0; i < urunler.length ; i++) {
            System.out.println(urunler[i] + "-> "+ fiyatlar[i]);
        }

        for (String urun : urunler){

            System.out.println(urun);
//            urun = "deneme";
//            System.out.println(urun);
        }






    }
}