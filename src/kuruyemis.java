
public class kuruyemis {

	public static void main(String[] args) {
		/*
		 * Bir kuruyemişçi toptancıdan; 12 kilo leblebiyi kilosunu 3.5 TL 25 kilo fındık
		 * , kilosunu 15.7 TL 40 kilo badem, kilosunu 22 TLden almıştır.
		 * 
		 * bu ürünleri satarken ; --> leblebinin kilosunu %50 fazlasına satmış -->fındık
		 * ise %40 fazlasına satmış -->badem ise, %60 fazlasına satmıştır. kuruyemişçi o
		 * günkü kazandığı para ile dükkanın kirasını ödemek istemektedir. kira
		 * tutarı=500TL kazandığı para 500 TL den yüksek ise kirayı ödeyebilsin değilse
		 * ödeyemesin.
		 * 
		 */
		double leblebi = 3.50;
		double fındık = 15.70;
		double badem = 22.00;
		double maliyeTutarı = (12 *leblebi) + (25 * fındık) + (40 *badem );
		double satisTutarı = ((leblebi * 1.5) * 12) + ((fındık * 1.4) * 25) + ((badem * 1.6) * 40);
		double sonuc = (satisTutarı - maliyeTutarı);
		if (sonuc > 500) {
			System.out.println("Kirayı ödeyebilirsiniz.");
		} 
		else {
			System.out.println("Kirayı ödeyemezsiniz.");
		}
	}

}
