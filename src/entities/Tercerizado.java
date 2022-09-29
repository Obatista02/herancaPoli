package entities;

public class Tercerizado extends Employee {

	private double adicional;

	public Tercerizado(String name, Integer hours, Double valuePerHour, double adicional) {
		super(name, hours, valuePerHour);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
}
