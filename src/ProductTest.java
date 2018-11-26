import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void test() {
		Category ropa = new Category();
		Product product = new Product("Pepe", 1, 1, 1f, Product.money.dollar, ropa);
		assertEquals(product.getName(), "Pepe");
		assertEquals(product.getStock(),1);
		assertEquals(product.getProductId(),1);
		assertEquals(product.time(),"11/12/2018");
	}

	
}
