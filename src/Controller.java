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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;

public class Controller {
static String enterE;
static String enterU;
    @FXML
    public TextField enterEmail;

    @FXML
    public TextField enterUser;

    @FXML
    private Label hiId;
    
    @FXML
    private PasswordField enterPassword;

    @FXML
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
    	
    	String email = enterEmail.getText();
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
			// GraphicInterface.esperar(2000);
			 LoginEmail x = new LoginEmail();
			 x.sendMail();
			 enterE = enterEmail.getText();
			 enterU = enterUser.getText();
			 GraphicInterface.todas.signUp.close();
			 modify();
			 GraphicInterface.todas.email.show();
		 }
	
    }
    void modify(){
    	hiId.setText(" hola amigos mios :)");
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
    	language = new ComboBox<>();
    	//ObservableList<String> languages = FXCollections.observableArrayList("Español","english","Rusian");
    	//language.setItems(languages);
    	//language.getItems();
    	language.getItems().addAll("Español","French");
    }

}

