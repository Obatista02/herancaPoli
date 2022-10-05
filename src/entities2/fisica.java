package entities2;

public class fisica extends imposto {

	private Double gastoSaude;

	public fisica() {
		super();
	}

	public fisica(String nome, double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double roubo() {
		double rob;
		if (getRendaAnual() < 20000) {
			rob = getRendaAnual() * 15 / 100;
		} else {
			rob = getRendaAnual() * 25 / 100;
		}
		rob -= gastoSaude * 5 / 100;
		if (gastoSaude < 0.0) {
			rob = 0.0;
		}
		return rob;
	};

}
