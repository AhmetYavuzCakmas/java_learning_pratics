
public class Main {

	public static void main(String[] args) {
		
		Otomobil otomobil1 = new Otomobil("Yeşil","Çelik");
		System.out.println(otomobil1.getRenk()+" "+otomobil1.getCant()+" "+otomobil1.getModel());

		Otomobil otomobil2 = new Otomobil("Mavi","Normal");
		System.out.println(otomobil2.getRenk()+" "+otomobil2.getCant()+" "+otomobil2.getModel());

	}

}
