package entities;

public class usedProduct extends Product{
	private String manufacturedDate;
	
	public usedProduct() {
		super();
	}

	public usedProduct(String name, Double price, String manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public String getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String toString() {
		return String.format(getName()+" $"+getPrice()+" Manufactured date: "+manufacturedDate);
	}


}
