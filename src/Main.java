import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		//User.sign_up();
		Scanner tec = new Scanner(System.in);
	
		Category c1 = new Category("Clothes",1);
		Category c2 = new Category("Sport",2);
		Category c3 = new Category("Books",3);
		Category c4 = new Category("Films",3);
		
		Product p1 = new Product("T-Shirt", 1 , 10 , 9.99f , Product.money.dollar, c1);
		Product p2 = new Product("Pants", 2 , 5 , 9.99f , Product.money.pound, c1);
		Product p3 = new Product("Socks", 3 , 2 , 4.99f , Product.money.euro, c1);

		Product g1 = new Product("Racket", 4 , 0 , 5.99f , Product.money.pound,c2);
		Product g2 = new Product("Ball", 5 , 10 , 16f , Product.money.dollar,c2);
		Product g3 = new Product("Swimsuit", 6 , 2 , 22.58f , Product.money.euro,c2);
		
		Product d1 = new Product("Don Quijote", 7 , 100 , 19.99f , Product.money.euro,c3);
		Product d2 = new Product("Hamlet", 8 , 7 , 199.99f , Product.money.pound,c3);
		Product d3 = new Product("The ugly Duckling", 9, 17 , 2.15f , Product.money.pound,c3);
		
		Menu  p = new Menu();
		p.start();
			
				
	}
			
			
		
			
		

	
}
