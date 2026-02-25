package quiz_tekrar;

import java.util.Scanner;

public class terslendirilmiş_metin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Metin giriniz: ");
		String metin = input.nextLine();
		
		
		StringBuilder terslendirilmis_metin =new StringBuilder();
		
		for(int i = 0; i<metin.length();i++) {
			char karakter = metin.charAt(i);
			if(Character.isUpperCase(karakter) ) {
				terslendirilmis_metin.append(Character.toLowerCase(karakter));
			}else if(Character.isLowerCase(karakter)) {
				terslendirilmis_metin.append(Character.toUpperCase(karakter));
			}else {
				terslendirilmis_metin.append(karakter);
			}
		}
		System.out.print(metin+" dönüştürüldü: "+terslendirilmis_metin);
	}

}
