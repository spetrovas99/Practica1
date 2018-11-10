import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws BooleanException {
		User.sign_up();
		Scanner tec = new Scanner(System.in);
	
		Category c1 = new Category("Clothes");
		Category c2 = new Category("Sports");
		Category c3 = new Category("Books");
		Category c4 = new Category("Films");
		
		Product p1 = new Product("T-Shirt", 1 , 10 , 9.99f , Product.money.dollar, c1);
		Product p2 = new Product("Pants", 2 , 5 , 9.99f , Product.money.pound, c1);
		Product p3 = new Product("Socks", 3 , 2 , 4.99f , Product.money.euro, c1);

		Product s1 = new Product("Racket", 4 , 0 , 5.99f , Product.money.pound,c2);
		Product s2 = new Product("Ball", 5 , 10 , 16f , Product.money.dollar,c2);
		Product s3 = new Product("Swimsuit", 6 , 2 , 22.58f , Product.money.euro,c2);
		
		Books b1 = new Books("Don Quijote", 7 , 100 , 19.99f , Product.money.euro,c3,"Cevantes", 11111,Books.lan.sp);
		Books b2 = new Books("Hamlet", 8 , 0 , 199.99f , Product.money.pound, c3, "Shakespeare", 22222,Books.lan.en);
		Books b3 = new Books("The ugly Duckling", 9, 17 , 2.15f , Product.money.pound,c3,"kid", 333333, Books.lan.fr);
		
		Product f1 = new Product("Star wars", 10 , 5 , 19.99f , Product.money.dollar,c4);
		Product f2 = new Product("Bat man 2", 11 , 10 , 59.99f , Product.money.euro,c4);
		Product f3 = new Product("Ready player one", 12 , 2 , 6.65f , Product.money.pound,c4);
		Product f4 = new Product("Total recall", 13 , 1 , 30.43f , Product.money.euro,c4);
	
		Menu.start();
			
				
	}
			
			
		
			
		

	
}
