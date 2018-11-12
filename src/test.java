import static org.junit.Assert.*;

import org.junit.Test;

public class test {


	@Test
	public void test() throws BooleanException {
		//fail("Not yet implemented");
		Category ropa = new Category();
		Category c2 = new Category("Sports");
		Product product = new Product("Pepe", 1, 1, 13.99f, Product.money.dollar, ropa);
		assertEquals(product.getName(), "Pepe");
		assertEquals(Category.seacrhCategory(), c2);
		equals(User.error("","","",3,true));
		equals(File.random());
	}

}
