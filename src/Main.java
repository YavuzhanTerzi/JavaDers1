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

         switch (grade){
             case'A':
                 System.out.println("Mükemmel");
                 break ;
             case'B':
                 System.out.println("Çok iyi");
                 break ;
             case'C':
                 System.out.println("iyi");
                 break ;
             case'D':
                 System.out.println("ortalama");
                 break ;
             case'F':
                 System.out.println("Kaldınız");
                 break ;
             default:
                 System.out.println("Geçersiz not girdiniz");
         }
         //-----------------------------------------------------------
        for (int i=2 ; i<8 ;i+=2){
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");
        //-----------------------------------------------------------
        int i=1 ;

        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");
        //------------------------------------------------------------
        int j=2 ;
        do{
            System.out.println(j);
            j+=3 ;
        }while(j<11) ;
        System.out.println("do-while döngüsü bitti");
        //------------------------------------------------------------


































    }
}
