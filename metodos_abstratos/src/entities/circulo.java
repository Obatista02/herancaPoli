package entities;

import entities.enums.color;

public class circulo extends corpo {

	private Double raio;

	public circulo() {
		super();
	}

	public circulo(color cor, Double raio) {
		super();
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}
}
