package entities;

public class Product {
	
	public String name	 ;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		
		return price*quantity;
		
	}
	
	public void addProcucts(int quantity) {
		
		this.quantity += quantity;

	}

	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		
		return name;
		
	}

}
