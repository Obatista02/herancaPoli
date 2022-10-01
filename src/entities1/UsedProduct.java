package entities1;

import java.util.Date;

public class UsedProduct extends Product {

	private Date criacao;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date criacao) {
		super(name, price);
		this.criacao = criacao;
	}

	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}

	@Override
	public String priceTag() {
		return name + " (used) $ " + price + " (Data de fabricação: " + criacao + ")";
	}
}
