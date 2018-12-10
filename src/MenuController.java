
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class MenuController {
	static String cat = "";
	static Product product;

	
    @FXML
    private TextField searchProduct;
    
    @FXML
    private Button searchButton;

    @FXML
    private SplitMenuButton allCategories;

    @FXML
    private MenuItem clothes;

    @FXML
    private MenuItem sports;

    @FXML

    private Label info;
    
    @FXML
    private	ImageView photo;
    
    @FXML
    private MenuItem books;

    @FXML
    private MenuItem films;

    @FXML
    private Button buy;
    
    @FXML
    private Button cart;
    
    @FXML
    private Label emptyCart;
    
    @FXML
    private Label notFound;

    @FXML
    void clothes(ActionEvent event) {
    	cat = "Clothes";
    	allCategories.setText(cat);
    }
    
    @FXML
    void sports(ActionEvent event) {
    	cat = "Sports";
    	allCategories.setText(cat);
    }
    
    @FXML
    void books(ActionEvent event) {
    	cat = "Books";
    	allCategories.setText(cat);
    }
    
    @FXML
    void films(ActionEvent event) {
    	cat = "Films";
    	allCategories.setText(cat);
    }
    @FXML
    void seeCart(ActionEvent event){
    	
    	info.setText(User.printInfo());
    	if (User.user.userProduct.isEmpty()){
    		emptyCart.setVisible(true);
		}
    	photo.setVisible(false);
    }
    
    @FXML
    void buy(ActionEvent event){
    	List<Product> userProduct = new ArrayList<Product>();
    	User.user.userProduct.add(product);
    }
    
   @FXML
    void search(ActionEvent event) {
	   if(!cat.equals("") && !searchProduct.getText().isEmpty()){
		   Category c = Category.categorySearch(cat);
		   Product p = c.productSearch(searchProduct.getText());
		   product = p;
		   if(p == null){
			   notFound.setVisible(true);
			   buy.setVisible(false);
			   photo.setVisible(false);
			   info.setVisible(false);
		   }else{
			   notFound.setVisible(false);
			   info.setText(Product.info(p));
			   if(p.getStock() == 0){
				   buy.setVisible(false);
			   }else{
			   buy.setVisible(true);
			   }
			  Image imagen = new Image(getClass().getClassLoader().getResourceAsStream("Images/" + p.getName() + ".jpg"));
			  photo.setImage(imagen); 
			  photo.setVisible(true);
		   }
	   }
   }
}
