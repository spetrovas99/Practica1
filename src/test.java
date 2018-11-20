import static org.junit.Assert.*;

import org.junit.Test;

public class test {


	@Test
	public void test() throws BooleanException {
		Category ropa = new Category();
		Category c2 = new Category("Sports");
		Product product = new Product("Pepe", 1, 1, 13.99f, Product.money.dollar, ropa);
		assertEquals(product.getName(), "Pepe");
	//	assertEquals(Category.seacrhCategory(), c2);
		assertEquals(User.error("correo@gmail.com","11234598765434","correonombre",3,false),true);
		assertEquals(User.error("","","",3,false),true);
	//	equals(File.random());
	}

}
