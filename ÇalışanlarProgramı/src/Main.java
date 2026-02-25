import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Çalışanlar programına hoşgeldiniz...");
	
		String islemler = "İşlemler...\n"
							+ "1. Yazılımcı İşlemleri\n"
							+ "2. Yönetici İşlemleri\n"
							+ "çıkış için q'ye basınız";
		
		System.out.println("******************************");
		System.out.println(islemler);
		System.out.println("******************************");
		 
		while(true) {
			System.out.print("işlem seçiniz: ");
			String islem = input.nextLine();
			
			if (islem.equals("q")) {
				
				System.out.println("programdan çıkılıyor...");
				break;
			}
			else if(islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Ahmet yavuz", "Çakmas", 123,"python,C,java");
				String yazilimci_islem = "1.format at\n"
										+"2. bilgileri göster\n"
										+"çıkış için q'ye basın ";
				System.out.println(yazilimci_islem);
				
				while (true) {
					System.out.println("işlemi seçiniz: ");
					String y_islem = input.nextLine();
					
					if(y_islem.equals("q")) {
						System.out.println("yazılımcı işlemlerinden çıkılıyor...");
						break;
					}
					else if(y_islem.equals("1")) {
						System.out.println("işletim sistemi: ");
						String isletim_sistemi = input.nextLine();	
					}
					else if(y_islem.equals("2")) {
						yazilimci.bilgileriGoster();
					}
					else{
						System.out.println("GEÇERSİZ YAZILIM İŞLEMİ....");
						
					}
					
				}
				
			}
			else if ( islem.equals("2")) {
				
				Yonetici yonetici = new Yonetici("Cumali ","SAVAŞ", 456, 5);
				 String yonetici_islem = "Yönetici İşlemleri:\n"
						 				+"1. zam yap\n"
						 				+"2. bilgileri göster\n"
						 				+"çıkış için q'ye basınız..";
				 System.out.println(yonetici_islem);
				 
				 while(true) {
					 System.out.println("İşlem seçiniz: ");
					 String y_islem = input.nextLine();
					 
					 if(y_islem.equals("q")) {
						 System.out.println("Yönetici işlemlerinden çıkılıyor... ");
						 break;
					 }
					 else if(y_islem.equals("1")) {
						 System.out.print("Yöneticinin ne kadar zam yapmasını istersin: ");
						 int zamMiktarı =input.nextInt();
						 input.hasNextLine();
						 yonetici.zamYap(zamMiktarı);
						 
					 }
					 else if(y_islem.equals("2")) {
						 yonetici.bilgileriGoster();
						 						 
					 }
					 else {
						 System.out.println();
					 }
					 
				 }
						 				
			}
			
		}	
		
	}

}
