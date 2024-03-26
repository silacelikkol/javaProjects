import java.util.Scanner;

public class biletKartuygulamasi {

    public static void main(String[] args) {
        // Biletkart uygulaması için metroda uygulanan ücret tarifesi aşağıdaki gibidir.
        //normal tarife:3TL
        //öğrenci ve 30(dahil) yaşından küçük olanlar :2.5TL
        //öğrenci ve 30 yaşından büyük olanlar:2.75TL
        //60(dahil)yaşından büyük olanlar:ücretsiz
        //Bir kişi her iki koşulu birden taşıması durumunda,daha düşük olan ücret tarifesi uygulanacaktır.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        double yas=scanner.nextDouble();
        System.out.println("Öğrenci misiniz? (evet için 1,hayır için 0 girin.)") ;
        int ogrenciMi=scanner.nextInt();
        double normalTarife=3;
        double ogrenciTarife=2.5;
        double ogrenci30UstuTarife=2.75;
        double ucretsizTarife=0;
        double odenecekTutar;

        if (yas <= 30 && ogrenciMi == 1) {
            if (ogrenciTarife < ogrenci30UstuTarife) {
                odenecekTutar = ogrenciTarife;
            } else {
                odenecekTutar = ogrenci30UstuTarife;
            }
        } else if (yas < 60) {
            if (ogrenciMi == 1) {
                odenecekTutar = ogrenciTarife;
            } else {
                odenecekTutar = normalTarife;
            }
        } else {
            odenecekTutar = ucretsizTarife;
        }

        System.out.println("Ödenecek tutar: " + odenecekTutar + " TL");

    }

}
