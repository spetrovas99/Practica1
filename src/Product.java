import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Product extends ChangeLanguage{
	protected enum money{euro,dollar,pound};
	protected String name;
	protected int productId;
	protected int stock;
	protected float price;
	protected float pricenop;
	protected money mny;
	Category cat;

	Product(){
		name = null;
		productId = 0;
		stock = 0;
		price = 0;
		pricenop = 0;
		mny = null;
	}
	
	Product(String name, int productId, int stock, float price, money mny, Category cat){
		this.mny = mny;
		this.name = name;
		this.productId = productId;
		this.stock = stock;
		this.price = price;
		this.pricenop = price + (price*10)/100;
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
	public float getPricenop() {
		return pricenop;
	}
	public void setPricenop(float pricenop) {
		this.pricenop = pricenop;
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
		default:
		}
		return null;
	}
	public void setMny(money mny) {
		this.mny = mny;
	}
	void changeMoney(money origin,money destiny){
		if(User.getUser().premium){
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
				default:
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
				default:
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
				default:
				}
			}
		}else{
			if (origin.toString().equals("euro")){
				switch(destiny.toString()){
				case "euro":
					break;
				case "dollar":
					pricenop *= 1.15;
					mny = money.dollar;
					break;
				case "pound":
					pricenop*= 0.88;
					mny = money.pound;
					break;
				default:
				}
			}
			if(origin.toString().equals("dollar")){
				switch(destiny.toString()){
				case "dollar":
					break;
				case "euro":
					pricenop*=0.87;
					mny = money.euro;
					break;
				case "pound":
					pricenop*=0.77;
					mny = money.pound;
					break;
				default:
					
				}
			}
			if(origin.toString().equals("pound")){
				switch(destiny.toString()){
				case "pound":
					break;
				case "dollar":
					pricenop*=1.31;
					mny = money.dollar;
					break;
				case "euro":
					pricenop*=1.13;
					mny = money.euro;
					break;
				default: 
				}
			}
		}
	}
	
	static void stats(Product product){
		System.out.println( ChangeLanguage.name + product.getName());
		System.out.print(ChangeLanguage.price);
		if(User.getUser().premium){
			System.out.printf("%.2f", product.price);
		}else{
			System.out.printf("%.2f", product.pricenop);
		}
		System.out.println(product.getMny());
		System.out.println((product.getStock() == 0)? notStock:"Stock: " + product.getStock());
		if(product.cat.getName().equals(books)){
			System.out.print(language);
			Books book = (Books)product;
			book.printLanguage();
		}
		
	}
	
	static String info (Product product){
		String info = "";
		info  = info + ChangeLanguage.name + product.getName() + "\r\n";
		info = info + ChangeLanguage.price;
		if(User.getUser().premium){
			info = info + product.price ;
		}else{
			info = info + product.pricenop;
		}
		info =info + product.getMny()+ "\r\n";
		if(product.getStock() == 0){
			info = info + notStock + "\r\n";
		}else{
			info = info + "Stock: " + product.getStock() + "\r\n";
		}
		
		if(product.cat.getName().equals(books)){
			info = info +language + "\r\n";
			Books book = (Books)product;
			book.printLanguage();
		}
		return info;
	}
	
	static String time(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 15);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		return (formato.format(cal.getTime()));
	}
}