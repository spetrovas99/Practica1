import java.util.Scanner;

public class Menu {
void start(){
	Scanner tec = new Scanner(System.in);
	String res;
	do{
		System.out.println("1-Search category.");
		System.out.println("2-Search product.");
		System.out.println("3-Show catalog.");
		System.out.println("4-Show my product list.");
		System.out.println("5-Close.");
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
			Category.printCategories();
			break;
		case "4":
			User.user.printUserProducts();
			break;
		case "5":
			System.out.println("See you later!");
			break;
		default:
			System.out.println("Choose from 1 to 5.");
		}	
	}while(!res.equals("5"));
}

}
