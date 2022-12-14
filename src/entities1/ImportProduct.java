package entities1;

public class ImportProduct extends Product {

	private Double customsFee;

	public ImportProduct() {
		super();
	}

	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	@Override
	public String priceTag() {
		return name +" $ "+ totalPrice() + "(Customds Fee: $ "+ customsFee +")" ; 
	}
	
}
