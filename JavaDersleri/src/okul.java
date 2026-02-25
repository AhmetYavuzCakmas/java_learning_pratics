
public class okul {

	public static void main(String[] args) {
		Ogrenciler ogrenci = new Ogrenciler();
		
		int sayi = ogrenci.kac_kisi;
		System.out.println(sayi);
		
		ogrenci.kayitEkle(45);
		ogrenci.kayitSil(12);

	}

}
