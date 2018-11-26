import static org.junit.Assert.*;
import org.junit.Test;

public class test {
	@Test
	public void test() throws BooleanException {
		
		Category ropa = new Category();
		Category c2 = new Category("Sports");
		Product product = new Product("Pepe", 1, 1, 13.99f, Product.money.dollar, ropa);
		assertEquals(product.getName(), "Pepe");
		System.out.println("introduce el nombre de la categoria");
		//tienes que poner el nombre de c2 (Sports) 
		assertEquals(Category.seacrhCategory(), c2);
		assertEquals(User.error("wdcefvfvfc","correo@gmail.com","correonombre",3,false), false);
		assertEquals(User.error("wdcefvfvfc","correogmail.com","correonombre",3,false), true);
	}
}
