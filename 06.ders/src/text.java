
public class text {

	public static void main(String[] args) {
	String[] array = {"elma","armut","kiraz"};
	for(String a: array) {
		System.out.println(a);
	}
	int i = 10;
	int newNum = 10 * i++;
	System.out.println(newNum);
	System.out.println(i);
	
	
	int k = 10;
	int newNum1 = 10 * (++k);
	System.out.println(newNum1);
	System.out.println(k);
	
	 int l = ++i + i;
	 System.out.println(l);
	 
	 int number = 30;
	 
	 if (number % 2 == 0)
		 System.out.println(number + " is even");
	 if (number % 5 == 0)
		System.out.println(number + " is multiple of 5");
	
	 int a = 10; 
	 int b = 20; 
	 // Daha büyük olan sayıyı bulmak için üçlü operatör kullanımı 
	 
	 int max = (a > b) ? a : b; 
	 System.out.println("Büyük olan sayı: " + max);
	
	
	 for (int b = 1; b < 100; System.out.println(b++));
	
	
	}
}
