import static org.junit.Assert.*;
import org.junit.Test;

public class CategoryTest {
	@Test
	public void test() throws BooleanException {
		
		Category c2 = new Category("Ropa");
		Product product = new Product("Pepe", 1, 1, 13f, Product.money.dollar, c2);
		System.out.println("introduce el nombre de la categoria(Ropa)");
		assertEquals(Category.seacrhCategory(), c2);
		System.out.println("introduce el nombre del producto(Pepe)");
		assertEquals( c2.searchProduct(), product);
		
	}
}

