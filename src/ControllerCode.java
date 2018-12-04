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
    	badCode.setVisible(false);
		if(!enterCode.getText().equals(LoginEmail.x + "")){
			enterCode.clear();
			badCode.setVisible(true);
		}else{
			GraphicInterface.todas.code.close();
			GraphicInterface.todas.menu.show();
		}
    }

}


   
   
    
