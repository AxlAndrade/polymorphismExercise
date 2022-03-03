package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double cumstomsFee) {
		super(name, price);
		this.customsFee = cumstomsFee;
	}

	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return  name + " $ "
				+ totalPrice() 
				+ " (customs fee: $ "
				+ customsFee;
	}
	
}
