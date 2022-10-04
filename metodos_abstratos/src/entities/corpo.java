package entities;

import entities.enums.color;

public abstract class corpo {
	private color cor;

	public corpo() {

	}
	
	public corpo(color cor) {
		super();
		this.cor = cor;
	}

	public color getCor() {
		return cor;
	}

	public void setCor(color cor) {
		this.cor = cor;
	}

	public abstract Double area();

}
