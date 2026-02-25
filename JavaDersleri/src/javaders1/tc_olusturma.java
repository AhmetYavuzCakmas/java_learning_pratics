package javaders1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class tc_olusturma {

	public static void main(String[] args) {
		List<Integer> numbers_list = new ArrayList<>();
		Random random = new Random();
		
		int size = numbers_list.size();
		int first_number = random.nextInt(9)+1;
		numbers_list.add(first_number);
		
		while (size<8) {
			int randomNumber = random.nextInt(10);
			numbers_list.add(randomNumber);
			size++;
		}
		
		int tek_toplam = 	numbers_list.get(0)+
							numbers_list.get(2)+
							numbers_list.get(4)+
							numbers_list.get(6)+
							numbers_list.get(8);
		
		int teklerin_carpimi= tek_toplam*7;
		
		int cift_toplam = 	numbers_list.get(1)+
							numbers_list.get(3)+
							numbers_list.get(5)+
							numbers_list.get(7); 
		
		int onuncu_hane = (teklerin_carpimi-cift_toplam)%10;
		numbers_list.add(onuncu_hane);
		
		int onbirinci_hane =( tek_toplam+cift_toplam+onuncu_hane)%10;
		numbers_list.add(onbirinci_hane);
		
		//StringBuilder kullanılarak sayılar birleştirme
		StringBuilder sb = new StringBuilder();
		for(int number:numbers_list) {
			sb.append(number);
		}
		//Sonucu tek bir sayı olarak yazdır
		String sonuc_tc = sb.toString();		
		
		
		System.out.println("rastgele kimlik numarası oluşturuldu: "+sonuc_tc);
	

	}

}
