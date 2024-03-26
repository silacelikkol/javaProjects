import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// Sıla Çelikkol: İBAN TR1234 000 567 890 785 8547 84 74
		//kullanıcı adı: sıla59 ---şifre:5959
		// Şevval Ünlü: İBAN TR1487 123 745 548 000 6587 2185
		//kullanıcı adı : şevval55---şifre:5555
		/*
		 * bakiye görüntülemek için--->1
		 * para çekmek için--->2
		 * farklı hesaba para yatırmak için--->3
		 * uygulamadan çıkmak için---> 4 tuşuna basınız.
		 */
		String işlemSeçenekleri=  "Bakiye Görüntüleme-->1"
				+  "Para Çekme-->2"
				+ "Farklı Hesaba Para Yatırmak İçin-->3"
				+ "Çıkış Yapmak İçin--> w tuşuna basınız.";
		double sılaBakiye= 3000;
		String sılaIBAN=  "TR1234 000 567 890 785 8547 84 74 ";
		String sılaKullanici=  "sıla59";
		String sılaSifre= "5959"; 
		
		double şevvalBakiye= 6500;
		String şevvalIBAN= "TR1487 123 745 548 000 6587 2185";
		String şevvalKullanici= "şevval55";
		String şevvalSifre= "5555";
		    System.out.println( "ATM'ye HOŞGELDİNİZ");
		    System.out.println( "Lütfen bilgilerinizi giriniz");
		    Scanner scanner = new Scanner(System.in);
		    System.out.println( "Kullanıcı adınızı giriniz.");
		    String kullaniciAdi=scanner.nextLine();
		    System.out.println( "Şifrenizi giriniz.");
		    String sifre= scanner.nextLine();
		    
		   if (kullaniciAdi.equals( "sıla59")&&sifre.equals( "5959")) 
		   {
			System.out.println( "Sıla Çelikkol hesabına giriş yapıldı.");
			System.out.println(işlemSeçenekleri);
			System.out.println( "Lütfen bir seçim yapınız.");
			String secim=scanner.nextLine();
			
			switch (secim) {
			case   "1" :
				System.out.println("Bakiyeniz:" + sılaBakiye);
				break;
			case  "2" :
				System.out.println("Çekmek istediğiniz tutarı giriniz.");
				int cekilecekTutar= scanner.nextInt();
				if (sılaBakiye>=cekilecekTutar) {
					sılaBakiye-=cekilecekTutar;
					System.out.println("Kalan tutar:" + sılaBakiye);
				} else {
						System.out.println("Bakiyenizden fazla para çekemezsiniz.");
					}
				break;
				
			case  "3" : 
				System.out.println("Ne kadar yatırmak istiyorsunuz?");
				int yatirilicakTutar=scanner.nextInt();
				if (yatirilicakTutar<=sılaBakiye) {
					System.out.println( "IBAN giriniz.");
					scanner.nextLine();
					String yatirilacakIban=scanner.nextLine();
					
					if (yatirilacakIban.equals(şevvalIBAN)) {
						System.out.println( "Para Şevval Ünlü adlı kişiye yatırılıyor. ");
						sılaBakiye-=yatirilicakTutar;
						şevvalBakiye+=yatirilicakTutar;
						System.out.println(" Bakiyeniz:" + sılaBakiye);
						System.out.println(" Şevvalin Bakiyesi:" + şevvalBakiye);
					
					}
				}
				break;
			
				
			case "w" :
				System.out.println("Uygulamadan çıkış yapılıyor...");
				
			break; }
			
			
		} else if (kullaniciAdi.equals( "şevval55")&&sifre.equals( "5555"))
		{
			System.out.println( "Şevval Ünlü hesabına giriş yapıldı.");
			System.out.println(işlemSeçenekleri);
			System.out.println("Lütfen bir seçim yapınız.");
			String secim=scanner.nextLine();
			
			switch (secim) {
			case   "1" :
				System.out.println("Bakiyeniz:" + şevvalBakiye);
				break;
			case  "2" :
				System.out.println("Çekmek istediğiniz tutarı giriniz.");
				int cekilecekTutar= scanner.nextInt();
				if (şevvalBakiye>=cekilecekTutar) {
					şevvalBakiye-=cekilecekTutar;
					System.out.println("Kalan tutar:" + şevvalBakiye);
				} else {
						System.out.println("Bakiyenizden fazla para çekemezsiniz.");
					}
				break;
			case  "3" : 
				System.out.println("Ne kadar yatırmak istiyorsunuz?");
				int yatirilicakTutar=scanner.nextInt();
				if (yatirilicakTutar<=şevvalBakiye) {
					System.out.println( "IBAN giriniz.");
					scanner.nextLine();
					String yatirilacakIban=scanner.nextLine();
					if (yatirilacakIban.equals(sılaIBAN)) {
						System.out.println( "Para Sıla Çelikkol adlı kişiye yatırılıyor. ");
						şevvalBakiye-=yatirilicakTutar;
						sılaBakiye+=yatirilicakTutar;
						System.out.println(" Bakiyeniz:" + şevvalBakiye);
						System.out.println(" Şevvalin Bakiyesi:" + sılaBakiye);
					}
				}
				break;
			case "w" :
				System.out.println("Uygulamadan çıkış yapılıyor...");
				}
				
		} else {
				
	System.out.println(  "Kullanıcı adınız veya şifreniz yanlış!!");
		
	   }
		
	} }
		
					
			    
		
		
				
			
				
			
				
			
		

		
		    
		    
		    
		    
		    		
		    		
		   
				
		
		
		

	


