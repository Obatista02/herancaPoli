package entities;

import entities.enums.color;

public class retangulo extends corpo {

	private Double largura;
	private Double altura;

	public retangulo() {
		super();
	}

	public retangulo(color cor, Double largura, Double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double area() {
		return altura * largura;
	}
}
