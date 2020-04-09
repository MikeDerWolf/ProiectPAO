package pao.proiect;
import java.time.LocalDate;

public class Camion extends Autovehicul {
	private double maxLoad;
	
	public Camion(String marca, int anFabricatie, double litraj, double pret, double maxLoad) {
		super(marca, anFabricatie, litraj, pret);
		this.maxLoad = maxLoad;
	}
	
	@Override
	public double getPretRedus() {
		if(LocalDate.now().getYear() - this.anFabricatie >=6)
			return 0.75*this.pret;
		else
			return this.pret;
	}
	
	public double getMaxLoad() {
		return this.maxLoad;
	}
	
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	@Override
	public String toString() {
		return "CAMION -- " + "Marca: " + this.marca + "  " + "An fabricatie: " + this.anFabricatie + "  " + "Litraj(L): " + this.litraj + "  " + "Pret vanzare(EUR): " + this.getPretRedus() + "  " + "Incarcatura maxima(t): " + this.maxLoad;
	}
}
