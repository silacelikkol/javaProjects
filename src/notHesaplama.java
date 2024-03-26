import java.util.Scanner;

public class notHesaplama {

	public static void main(String[] args) {
		// vize1 %40---final %60
		// GEÇME NOTU 50
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınızı Giriniz ");
		String isim = scanner.nextLine();
		System.out.println("Soyadınızı Giriniz");
		String soyad = scanner.nextLine();
		System.out.println("Dersin adını giriniz");
		String dersİsmi = scanner.nextLine();
		System.out.println("vize1 notunuzu giriniz.");
		double vize1 = scanner.nextDouble();

		System.out.println("final notunuzu giriniz.");
		double fiinal = scanner.nextDouble();

		double sonuc = (vize1 * 0.4) + (fiinal * 0.6);

		if (sonuc >= 50) {
			System.out.println(isim + " " + soyad + " adlı öğrenci " + dersİsmi + " dersinden " + sonuc
					+ " ortalamayla geçmiştir. ");
		} else {
			System.out.println("Dersten kaldınız");
		}
	}

}
