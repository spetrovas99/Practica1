import java.util.Scanner;

public class Menu {
static void start(){
	Scanner tec = new Scanner(System.in);
	String res;
	do{
		System.out.println("1-Search category.");
		System.out.println("2-Search product.");
		System.out.println("3-Buy");
		System.out.println("4-Show catalog.");
		System.out.println("5-Show my product list.");
		System.out.println("6-Close.");
		res = tec.nextLine();
		switch(res){
		case "1":
			Category c = Category.seacrhCategory();
			if (c == null) {
				System.out.println("It has not been found.");
			} else {
				c.printProducts();
			}
			break;
		case "2":
			Category search = Category.seacrhCategory();
			if (search == null){
				System.out.println("It has not been found.");
			}
			else{
			search.printProducts();
			}
			if(search != null)
				search.searchProduct();
			break;
		case "3":
			Category searches = Category.seacrhCategory();
			if (searches == null){
				System.out.println("It has not been found.");
			}
			else{
			searches.printProducts();
			}
			if(searches != null) { 
				Product prod = searches.searchProduct();
				if(prod != null){
					if(prod.getStock() > 0){
						System.out.println("Buy?(yes/no)");
						res=tec.nextLine();
						if(res.equals("yes") && prod != null){
							User.user.buy(prod);
							System.out.println("Purchase succesfully.");
						} 
					}
				}
			}
			break;
		case "4":
			Category.printCategories();
			break;
		case "5":
			User.user.printUserProducts();
			break;
		case "6":
			System.out.println("See you later!");
			break;
		default:
			System.out.println("Choose from 1 to 6.");
		}	
	}while(!res.equals("6"));
}
}

// quitar el stock en el summary.