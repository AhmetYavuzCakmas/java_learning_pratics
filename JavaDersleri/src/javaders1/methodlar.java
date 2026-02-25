package javaders1;

public class methodlar {

	public static void main(String[] args) {
		int[] sayilar = {-10,-20,-45,-78,-41,-01,-32,-79};	
		int sonuc_buyuk = en_buyuk_bulma(sayilar);
		System.out.println("liste içinden en büyük sayı: "+sonuc_buyuk);
		
		
	}
	public static int en_buyuk_bulma(int[] arrays) {
		
		//int en_buyuk= 0;
		int en_buyuk = arrays[0];
		for(int buyuk:arrays) {
			/*
			if(en_buyuk<buyuk) {
				en_buyuk=buyuk;
			}
			*/
		 en_buyuk = Math.max(en_buyuk, buyuk);
		}
		return en_buyuk;
	}

}
