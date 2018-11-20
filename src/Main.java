import java.util.Scanner;
public class Main extends ChangeLanguage{
	public static void main(String[] args) throws BooleanException  {
		Scanner tec = new Scanner(System.in);
		System.out.println("Choose language");
		System.out.println("1-Español");
		System.out.println("2-English");
		int x = tec.nextInt();
		switch(x){
		case 1:
			ChangeLanguage.changeSpanish();
			break;
		case 2:
			ChangeLanguage.changeEnglish();
			break;
		default:
		}
		User.sign_up();
		File.newemail();
		File.newemail2();
	
		Category c1 = new Category(clothes);
		Category c2 = new Category(sports);
		Category c3 = new Category(books);
		Category c4 = new Category(films);
		
		Product p1 = new Product(t_shirt, 1 , 10 , 9.99f , Product.money.dollar, c1);
		Product p2 = new Product(pants, 2 , 5 , 9.99f , Product.money.pound, c1);
		Product p3 = new Product(socks, 3 , 2 , 4.99f , Product.money.euro, c1);

		Product s1 = new Product(racket, 4 , 0 , 5.99f , Product.money.pound,c2);
		Product s2 = new Product(ball, 5 , 10 , 16f , Product.money.dollar,c2);
		Product s3 = new Product(swimsuit, 6 , 2 , 22.58f , Product.money.euro,c2);
		
		Books b1 = new Books("Don Quijote", 7 , 100 , 19.99f , Product.money.euro,c3,"Cevantes", 11111,Books.lan.sp);
		Books b2 = new Books("Hamlet", 8 , 0 , 199.99f , Product.money.pound, c3, "Shakespeare", 22222,Books.lan.en);
		Books b3 = new Books(The_ugly_Duckling, 9, 17 , 2.15f , Product.money.pound,c3,"kid", 333333, Books.lan.fr);
		
		Product f1 = new Product("Star wars", 10 , 5 , 19.99f , Product.money.dollar,c4);
		Product f2 = new Product("Bat man 2", 11 , 10 , 59.99f , Product.money.euro,c4);
		Product f3 = new Product("Ready player one", 12 , 2 , 6.65f , Product.money.pound,c4);
		Product f4 = new Product(Total_recall, 13 , 1 , 30.43f , Product.money.euro,c4);
	
		Menu.start();		
	}
			
			
		
			
		

	
}
