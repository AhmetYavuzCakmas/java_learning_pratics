import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a list1: ");
		int ilk_sayi = input.nextInt();
		int[] ilk_list1 =new int[ilk_sayi];
		for(int i = 0;i<ilk_sayi;i++) {
			int sayi=input.nextInt();
			ilk_list1[i] = sayi;
		}
		
		System.out.println("Enter a list2: ");
		int ilk_sayi_list2 = input.nextInt();
		int[] ilk_list2 =new  int[ilk_sayi_list2];
		for(int i = 0;i<ilk_sayi_list2;i++) {
			int sayi=input.nextInt();
			ilk_list2[i] = sayi;
		}

		found_common(ilk_list2, ilk_list1);
	}
	
	public static void found_common(int[] list1,int[] list2) {
		Integer[] commonList = new Integer[list1.length];
		int k = 0;
		System.out.print("one of the common numbers are: ");
		for(int i=0;i<list1.length;i++) {
			for(int j = 0;j<list2.length;j++) {
				if(list1[i] == list2[j]) {
					commonList[k] = list1[i];
					k ++;
					break;
				}
			}
		}
		System.out.println("Common numbers are: " + Arrays.toString(commonList));
		 
	}

}
