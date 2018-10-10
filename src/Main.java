import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		User.sign_up();
		Configuration.read();
		Scanner tec = new Scanner(System.in);
		User x = new User();
		//x.sign_up();
		Category v = new Category("ropa",1);
		Category b = new Category("deporte",2);
		Category n = new Category("libros",3);
		Category.printCategories();
		Product v1 = new Product("camiseta", 1 , 10 , 9.99f , Product.money.dollar, v);
		Product b1 = new Product("raqueta", 1 , 0 , 5.99f , Product.money.pound,b);
		Product n1 = new Product("Don Quijote", 1 , 100 , 19.99f , Product.money.euro, n);
		//v.printProducts();
		//b.printProducts();
		//n.printProducts();
		Category.seacrhCategory().printProducts();
		
		
			
				
	}
			
			
		
			
		

	
}
