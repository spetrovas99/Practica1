import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Product {
	enum money{euro,dollar,pound};
	protected String name;
	protected int productId;
	protected int stock;
	protected float price;
	protected money mny;
	User my;
	Category cat = new Category();

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
	void changeMoney(int price, money origin,money destiny){
		if (origin.toString().equals("euro")){
			switch(destiny.toString()){
			case "euro":
				break;
			case "dollar":
				price *= 1.15;
				break;
			case "pound":
				price*= 0.88;
				break;
			}
		}
		if(origin.toString().equals("dollar")){
			switch(destiny.toString()){
			case "dollar":
				break;
			case "euro":
				price*=0.87;
				break;
			case "pound":
				price*=0.77;
				break;
			}
		}
		if(origin.toString().equals("pound")){
			switch(destiny.toString()){
			case "pound":
				break;
			case "dollar":
				price*=1.31;
				break;
			case "euro":
				price*=1.13;
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
	void finalPrice(){
		if (!my.getPremium()){
			price += mailPlus(price);
			System.out.println(price);
		}
	}
	static void stats(Product product){
		System.out.println(product.getName());
		System.out.println(product.getPrice() + " " + product.getMny().toString());
		System.out.println(product.getStock());
	}
	void compra(){
		if(stock>0)
			stock--;
		else{
			System.out.println("no hay stock");
		}
	}
	
}
