import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Category {
	String name;
	
	int id;
	static List<Category> categories = new ArrayList<Category>();
	List<Product> products = new ArrayList<Product>();
	
	Category(){
		name = null;
		id = 0;
	}
	Category(String name, int id){
		this.name = name;
		this.id = id;
		categories.add(this);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	String getName(){
		return name;
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
		String res;
		Category aux = new Category();
		System.out.println("Buscar categoria: ");
		Scanner tec = new Scanner(System.in);
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
			aux = categories.get(p);
		}
		else{
			System.out.println("No se ha encontrado.");
		}
		return aux;
	}
	
	
	void searchProduct(){
		String res;
		System.out.println("Buscar producto: ");
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
		}
		else{
			System.out.println("No se ha encontrado.");
		}
		
	}
		
		 
}
