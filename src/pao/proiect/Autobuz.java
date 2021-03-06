package pao.proiect;
import java.time.LocalDate;

public class Autobuz extends Autovehicul {
	private int capacitatePersoane;
	
	public Autobuz() {
		super();
		this.tip = "AUTOBUZ";
	}
	
	public Autobuz(String marca, int anFabricatie, double litraj, double pret, int capacitatePersoane) {
		super(marca, anFabricatie, litraj, pret);
		this.capacitatePersoane = capacitatePersoane;
		this.tip = "AUTOBUZ";
	}
	
	@Override
	public double getPretRedus() {
		if(LocalDate.now().getYear() - this.anFabricatie >=5)
			return 0.8*this.pret;
		else
			return this.pret;
	}
	
	public int getCapacitatePersoane() {
		return this.capacitatePersoane;
	}
	
	public void setCapacitatePersoane(int capacitatePersoane) {
		this.capacitatePersoane = capacitatePersoane;
	}
	
	@Override
	public int getInt() {
		return this.capacitatePersoane;
	}
	
	@Override
	public String toString() {
		return this.tip + " -- " + "ID: " + this.id + "  " + "Marca: " + this.marca + "  " + "An fabricatie: " + this.anFabricatie + "  " + "Litraj(L): " + this.litraj + "  " + "Pret vanzare(EUR): " + this.getPretRedus() + "  " + "Capacitate maxima persoane: " + this.capacitatePersoane;
	}
}
