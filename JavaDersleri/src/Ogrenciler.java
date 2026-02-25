
public class Ogrenciler {
	
	int kac_kisi = 150;
	
	public void kayitEkle(int sayi) {
		kac_kisi += sayi;
		System.out.println("öğrenci sayısı arttırıldı: "+kac_kisi);
		
	}
	
	public void kayitSil(int sayi) {
		kac_kisi -= sayi;
		System.out.println("öğrenci silindi, örenci sayisi:"+kac_kisi);
	}
	

}




