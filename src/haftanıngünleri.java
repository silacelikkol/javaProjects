import java.util.Scanner;

public class haftanıngünleri {

	public static void main(String[] args) {
		// haftanın günlerini bulma
		
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lütfen bir sayı giriniz.");
        int sayi = scanner.nextInt();
        switch (sayi) {
		case 1:
			System.out.println( "Pazartesi");
		break;
		case 2:
			System.out.println( "Salı");
			break;
		case 3 :
			System.out.println( "Çarşamba");
			break;
		case 4:
			System.out.println( "Perşembe");
			break;
		case 5:
			System.out.println( "Cuma");
			break;
		case 6:
			System.out.println( "Cumartesi");
			break;
		case 7:
			System.out.println( "Pazar");
			break;

		default:
			System.out.println( "Lütfen 1 ile 7 aralığında sayı giriniz.");
			break;
		}
	}

}
