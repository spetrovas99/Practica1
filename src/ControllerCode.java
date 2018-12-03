import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerCode {

    @FXML
    private TextField enterCode;

    @FXML
    private Button okayButton;
    
    @FXML
    private Label badCode;
    
    @FXML
    void code(ActionEvent event) {
    	 boolean good = false;
		 do{
			 if(!enterCode.getText().equals(LoginEmail.x)){
				 badCode.setVisible(true);
			 }else{
				 good = true;
			 }
		 }while(!good);
		 GraphicInterface.todas.code.close();
		 GraphicInterface.todas.menu.show();
		 
    }

}


   
   
    
