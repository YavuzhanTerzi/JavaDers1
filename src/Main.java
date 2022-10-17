import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        //------------------------------------------
        int ogrenciSayisi = 12;
        String mesaj = "Ögrenci sayisi : ";
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Ögrenci sayim : " + ogrenciSayisi);
        //-------------------------------------------------------
        double sayi = 12.5;
        sayi = -129;
        char karakter = 'A';
        boolean dogruMu = false;
        //-----------------------------------------------------
        int sayi1 = 24;
        if (sayi1 < 20) {
            System.out.println("Sayi 20'den kücüktür");
        } else if (sayi1 == 20) {
            System.out.println("Sayi 20'ye esittir");
        } else {
            System.out.println("Sayi 20'den büyüktür");
        }
        //----------------------------------------------
        int sayi5 = 41;
        int sayi6 = 61;
        int sayi7 = 34;
        int enBuyuk = sayi5;

        if (enBuyuk < sayi6) {
            enBuyuk = sayi6;
        }

        if (enBuyuk < sayi7) {
            enBuyuk = sayi7;
        }

        System.out.println("En büyük sayi=" + enBuyuk);
        //---------------------------------------------------
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok iyi");
                break;
            case 'C':
                System.out.println("iyi");
                break;
            case 'D':
                System.out.println("ortalama");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
        //-----------------------------------------------------------
        for (int i = 2; i < 8; i += 2) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");
        //-----------------------------------------------------------
        int i = 1;

        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti");
        //------------------------------------------------------------
        int j = 2;
        do {
            System.out.println(j);
            j += 3;
        } while (j < 11);
        System.out.println("do-while döngüsü bitti");
        //------------------------------------------------------------
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        //ogrenciler[4]="Ali   ;

        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println(ogrenciler[k]);
        }
        System.out.println("-----------------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("-----------------------------JavaDers15");
        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);

        System.out.println("-----------------------------JavaDers16");
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Çanakkale";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Trabzon";
        sehirler[2][1] = "Gümüşhane";
        sehirler[2][2] = "Artvin";

        for (int t = 0; t <= 2; t++) {
            for (int s = 0; s <= 2; s++) {
                System.out.println(sehirler[t][s]);
            }
        }
        System.out.println("-----------------------------JavaDers17");

        String mesaj2 = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj2.length());
        System.out.println("5.eleman : " + mesaj2.charAt(4));
        System.out.println(mesaj2.concat(" Yaşasın!"));
        System.out.println(mesaj2.startsWith("B"));
        System.out.println(mesaj2.endsWith("."));
        char[] karakterler = new char[5];
        mesaj2.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj2.indexOf("a"));
        System.out.println(mesaj2.lastIndexOf("a"));
        System.out.println("-----------------------------JavaDers18");

        String yeniMesaj = mesaj2.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj2.substring(2, 5));

        for (String kelime : mesaj2.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj2.toLowerCase());
        System.out.println(mesaj2.toUpperCase());
        System.out.println(mesaj2.trim());
        System.out.println("-----------------------------JavaDers19-Sayı Asal mı");

        int number = 61;
        int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı Asal Değildir");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz Sayı");
            return;
        }

        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı Asal Değildir");
        }
        System.out.println("-----------------------------JavaDers20");

        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default :
                System.out.println("İnce Sesli Harf");
        }
        System.out.println("-----------------------------JavaDers21");
        int number21 = 28 ;
        int total21 = 0 ;

        for(int f=1 ; f<number21 ; f++){
            if(number21 % f == 0 ){
                total21 = total21 + f;
            }
        }

        if(total21 == number21){
            System.out.println("Mükemmel Sayıdır");
        }
        else{
            System.out.println("Mükemmel Sayı Değildir");
        }
        System.out.println("-----------------------------JavaDers22");

        int number22 = 220 ;
        int number23 = 284 ;
        int total22 = 0 ;
        int total23 = 0 ;

        for(int v=1 ; v<number22 ; v++){
            if(number22 % v == 0 ){
                total22 = total22 + v;
            }
        }

        for(int v=1 ; v<number23 ; v++){
            if(number23 % v == 0 ){
                total23 = total23 + v;
            }
        }

        if(number22==total23 && number23==total22){
            System.out.println("bu iki sayı arkadaştır");
        }
        else{
            System.out.println("bu iki sayı arkadaş değildir");
        }
        System.out.println("-----------------------------JavaDers23");

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false ;

        for(int sayi23 : sayilar){}















    }
}
