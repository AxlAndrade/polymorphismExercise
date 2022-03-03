package entities;

public class ImportedProduct extends Product {

	private Double cumstomsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double cumstomsFee) {
		super(name, price);
		this.cumstomsFee = cumstomsFee;
	}

	public Double totalPrice();
	
}
