import java.util.Scanner;

public class Menu extends ChangeLanguage {
static void start(){
	Scanner tec = new Scanner(System.in);
	String res;
	
	User.code();
	System.out.println(welcome);
	do{
		System.out.println("1-" + searchCategory);
		System.out.println("2-" + searchProduct);
		System.out.println("3-" + buy);
		System.out.println("4-" + showCatalog);
		System.out.println("5-" + showProductList);
		System.out.println("6-" + close);
		res = tec.nextLine();
		switch(res){
		case "1":
			Category c = Category.seacrhCategory();
			if (c == null) {
				System.out.println(notFound);
			} else {
				c.printProducts();
			}
			break;
		case "2":
			Category search = Category.seacrhCategory();
			if (search == null){
				System.out.println(notFound);
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
				System.out.println(notFound);
			}
			else{
			searches.printProducts();
			}
			if(searches != null) { 
				Product prod = searches.searchProduct();
				if(prod != null){
					if(prod.getStock() > 0){
						System.out.println(buyQ);
						res=tec.nextLine();
						if(res.equals("yes") && prod != null){
							User.user.buy(prod);
							File.tiquet(prod);
							System.out.println(checkEmail);
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
			System.out.println(bye);
			break;
		default:
			System.out.println(choose);
		}	
	}while(!res.equals("6"));
}
}