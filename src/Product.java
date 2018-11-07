import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Product {
	protected enum money{euro,dollar,pound};
	protected String name;
	protected int productId;
	protected int stock;
	protected float price;
	//G
	protected money mny;
	User my;
	Category cat;

	Product(){
		name = null;
		productId = 0;
		stock = 0;
		price = 0;
		mny = null;
	}
	Product(String name, int productId, int stock, float price, money mny, Category cat){
		this.mny = mny;
		this.name = name;
		this.productId = productId;
		this.stock = stock;
		this.price = price;
		cat.products.add(this);
		this.cat = cat;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public String getMny() {
		switch(mny.toString()){
		case "euro":
			return  "€";
		case "pound":
			return "£";
		case "dollar":
			return "$";
		}
		return null;
	}
	public void setMny(money mny) {
		this.mny = mny;
	}
	void changeMoney(money origin,money destiny){
		if (origin.toString().equals("euro")){
			switch(destiny.toString()){
			case "euro":
				break;
			case "dollar":
				price *= 1.15;
				mny = money.dollar;
				break;
			case "pound":
				price*= 0.88;
				mny = money.pound;
				break;
			}
		}
		if(origin.toString().equals("dollar")){
			switch(destiny.toString()){
			case "dollar":
				break;
			case "euro":
				price*=0.87;
				mny = money.euro;
				break;
			case "pound":
				price*=0.77;
				mny = money.pound;
				break;
			}
		}
		if(origin.toString().equals("pound")){
			switch(destiny.toString()){
			case "pound":
				break;
			case "dollar":
				price*=1.31;
				mny = money.dollar;
				break;
			case "euro":
				price*=1.13;
				mny = money.euro;
				break;
			}
		}
	}
	float mailPlus(float price){
		float cost = 0;
		if(price<30)
			cost=+(10*price/100);
		else
			cost=0;
		return cost;
	}
	
	static void stats(Product product){
		Scanner tec = new Scanner(System.in);
		String res;
		System.out.println("Name: " + product.getName());
		System.out.print("Price:");
		System.out.printf("%.2f", product.price);
		System.out.println(product.getMny().toString());
		System.out.println((product.getStock() == 0)?"Out of stock":"Stock: " + product.getStock());
		if(product.cat.getName().equals("Books")){
			System.out.print("Language:");
			Books book = (Books)product;
			book.printLanguage();
		}
		
	}
	
}
