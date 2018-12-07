import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
<<<<<<< HEAD
import javafx.scene.control.MenuItem;
=======
>>>>>>> 6761a032c5c21029f9cadcf93be7804e2399b25a
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;

public class Controller {
static String user;
static String email;
    @FXML
    public TextField enterEmail;

    @FXML
    public TextField enterUser;

    @FXML
    private PasswordField enterPassword;

    @FXML
<<<<<<< HEAD
    private MenuItem español;
    
    @FXML
    private MenuItem english;
    
    @FXML
=======
>>>>>>> 6761a032c5c21029f9cadcf93be7804e2399b25a
    private CheckBox premiumBotton;

    @FXML
    private TextField enterCreditCard;

    @FXML
    private Button enterButton;
    
    @FXML
    private Label check;
    
    @FXML
    private Label error;
    
    @FXML
    private ComboBox<String> language;

    @FXML
    void enterButtonPressed(ActionEvent event) {
    	boolean bad = false;
    	if(enterUser.getText().length() < 7 || enterPassword.getText().length() < 7){
    		bad = true;
    		enterUser.clear();
    		enterPassword.clear();
    	}else{
    		error.setVisible(false);
    	}
    	String creditPattern = "[0-9]";
		Pattern pat = Pattern.compile(creditPattern);
		Matcher mat = pat.matcher(enterCreditCard.getText());
		if (enterCreditCard.isVisible() && enterCreditCard.getText().length() < 10 && !mat.matches()) {
		     enterCreditCard.clear();
		     bad = true;
	}else{
		 error.setVisible(false);
	}
    	
		email = enterEmail.getText();
    	String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
			      "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(email);
		 if (!matcher.matches()) {
			     enterEmail.clear();
			     bad = true;
		}else{
			 error.setVisible(false);
		}
		 
		 if(bad){
			 error.setVisible(true);
		 }else{
			 check.setVisible(true);
			 LoginEmail x = new LoginEmail();
			 x.sendMail();
			 user = enterUser.getText();
			 email = enterEmail.getText();
			 GraphicInterface.todas.signUp.close();
			 GraphicInterface.todas.email.show();
			 GraphicInterface.todas.code.show();
		 }
	
    }
    
    @FXML
    void premiumButtonPressed(ActionEvent event) {
    		enterCreditCard.setVisible(true);
    		if(!premiumBotton.isSelected()){
    			enterCreditCard.setVisible(false);
    		}
    }
    
    @FXML
    void changeLanguage(ActionEvent event){
<<<<<<< HEAD
    	//if(español.selec)
    }

}
=======
    	language = new ComboBox<>();
    	//ObservableList<String> languages = FXCollections.observableArrayList("Español","english","Rusian");
    	//language.setItems(languages);
    	//language.getItems();
    	language.getItems().addAll("Español","French");
    }

}

>>>>>>> 6761a032c5c21029f9cadcf93be7804e2399b25a
