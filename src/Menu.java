import java.util.Scanner;

public class Menu {
void start(){
	Scanner tec = new Scanner(System.in);
	String res;
	do{
		System.out.println("1-Buscar categoria.");
		System.out.println("2-Buscar producto.");
		System.out.println("3-Mostrar catalogo.");
		System.out.println("4-Mostar mi lista de compra.");
		System.out.println("5-Salir.");
		res = tec.nextLine();
		switch(res){
		case "1":
			Category.seacrhCategory().printProducts();
			break;
		case "2":
			Category search = Category.seacrhCategory();
			search.printProducts();
			if(search != null)
				search.searchProduct();
			break;
		case "3":
			Category.printCategories();
			break;
		case "4":
			
			
			break;
		case "5":
			System.out.println("Hasta luego!");
			break;
		default:
			System.out.println("Elija del 1 al 5.");
		}	
	}while(!res.equals("5"));
}

}
