package entities;

public class importedProduct extends Product {
	private Double customFee;
	
	public importedProduct() {
		super();
	}
	
	public importedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return getPrice()+customFee;
	}
	public String toString() {
		return String.format(getName()+" $"+getPrice()+" custom fee $"+customFee);
	}
}
