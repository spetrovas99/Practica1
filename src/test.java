import static org.junit.Assert.*;

import org.junit.Test;

public class test {


	@Test
	public void test() {
		//fail("Not yet implemented");
		Category ropa = new Category();
		Category c2 = new Category("Sports");
		Product product = new Product("Pepe", 1, 1, 13.99f, Product.money.dollar, ropa);
		assertEquals(product.getName(), "Pepe");
		//assertEquals(product.mailPlus(13.99f), 13.99);
		assertEquals(Category.seacrhCategory(), c2);
		equals(User.error("","","",""));
	}

}
