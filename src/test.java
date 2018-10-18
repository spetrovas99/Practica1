import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Category ropa = new Category();
		Product product = new Product("Pepe", 1, 1, 1f, Product.money.dollar, ropa);
		assertEquals(product.getName(), "Pepe");
	}

}
