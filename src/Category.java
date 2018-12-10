import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Category extends ChangeLanguage {
	private String name;
	
	static List<Category> categories = new ArrayList<Category>();
	List<Product> products = new ArrayList<Product>();
	
	Category(){
		name = null;	
	}
	
	Category(String name){
		this.name = name;
		categories.add(this);
	}
	
	String getName(){
		return name;
	}
	
	void setName( String name){
		this.name = name;
	}
	
	static void printCategories(){
		for (int i = 0; i < categories.size(); i++){
			System.out.println(categories.get(i).getName());
		}
	}
	
	void printProducts(){
		for (int i = 0; i < this.products.size(); i++){
			System.out.println(this.products.get(i).getName());
		}
	}
	
	static Category seacrhCategory(){
		Scanner tec = new Scanner(System.in);
		String res;
		Category cat = null;
		System.out.println(searchCategory);
		res = tec.nextLine();
		boolean esta = false;
		int p = 0;
		for(int i = 0; i< categories.size(); i++){
			if(res.equals(categories.get(i).getName())){
				esta = true;
				p = i;
				break;
			}
		}
		if(esta){
			cat = categories.get(p);
		}
		return cat;
	}

	
	static Category categorySearch(String name){
		Category c = null;
		for(int i = 0; i < categories.size(); i++){
			if(name.equals(categories.get(i).getName())){
				c = categories.get(i);
			}
		}
		return c;
	}
	
	Product productSearch(String name){
		Product p = null;
		for(int i = 0; i < this.products.size(); i++){
			if(name.equals(this.products.get(i).getName())){
				p = this.products.get(i);
			}
		}
		return p;
	}
	
	
	 Product searchProduct(){
		Product product= null;
		String res;
		System.out.println(searchProduct);
		Scanner tec = new Scanner(System.in);
		res = tec.nextLine();
		boolean esta = false;
		int p = 0;
		for(int i = 0; i< products.size(); i++){
			if(res.equals(products.get(i).getName())){
				esta = true;
				p = i;
				break;
			}
		}
		if(esta){
			Product.stats(products.get(p));
			product=products.get(p);
		}
		else{
			System.out.println(notFound);
		}
		return product;
	}	 
}