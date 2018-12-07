
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class MenuController {
	static String cat;
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
    private	ImageView photos;
    
    @FXML

    private MenuItem books;

    @FXML
    private MenuItem films;

    
    @FXML
    private Label notFound;

    @FXML
    void clothes(ActionEvent event) {
    	cat = "Clothes";
    }
    
    @FXML
    void sports(ActionEvent event) {
    	cat = "Sports";
    }
    
    @FXML
    void books(ActionEvent event) {
    	cat = "Books";
    }
    
    @FXML
    void films(ActionEvent event) {
    	cat = "Films";
    }
    void infoProd(Product p , MouseEvent event){
    	info.setText("name" + p.getName() + "/n" + "gt");
    	
    }
    
    @FXML
    void info(MouseEvent event){

    }
    
   @FXML
    void search1(ActionEvent event) {
	   if(cat != null && !searchProduct.getText().isEmpty()){
		   Category c = Category.categorySearch(cat);
		   Product p = c.productSearch(searchProduct.getText());
		   if(p == null){
			   notFound.setVisible(true);
			   infoProd(p, null);
		   }else{
			   notFound.setVisible(false);
		   }
	   }
    }

    @FXML
    void igual(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {
    	
    }

}
