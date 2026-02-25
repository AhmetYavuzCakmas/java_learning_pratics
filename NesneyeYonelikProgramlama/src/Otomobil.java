
public class Otomobil {

	private String renk;
	private String cant;
	private String model = "Audi";
	private int en = 2;
	private int boy = 3;
	
	//constructor metodu 1
	public Otomobil(String renk,String cant) {
		this.renk = renk;
		this.cant = cant;
	}
	
	//Constructor Metodu 2
	public Otomobil() {
		this.renk = "Mavi";
		this.cant = "Normal";
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getCant() {
		return cant;
	}

	public void setCant(String cant) {
		this.cant = cant;
	}

	public String getModel() {
		return model;
	}

	public int getEn() {
		return en;
	}

	public int getBoy() {
		return boy;
	}
	
	
	
}
