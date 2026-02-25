
public class exception {

	public static void main(String[] args) {
		System.out.println("program başladı");
		
		int a = 0;
		try {
			a = 2/0;
			System.out.println("try içerisinde");// hatadan sonraki kodlar çalışmaz catch bloğuna geçer
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); 
			System.out.println("-----------------------------");
		}
		
		int[] arr = new int[3];
		try {
			arr[4]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("program bitti");

		
		
		
		
		
		
		
		
	}
}
