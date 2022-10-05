package entities2;

public class juridica extends imposto {

	private Integer numeroFuncionario;

	public juridica() {
		super();
	}

	public juridica(String nome, double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double roubo() {
		if (numeroFuncionario > 10) {
			return getRendaAnual() * 14 / 100;
		} else {
			return getRendaAnual() * 16 / 100;
		}
	}

}
