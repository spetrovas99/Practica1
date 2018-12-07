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
<<<<<<< HEAD
			GraphicInterface.todas.email.close();
=======
>>>>>>> 6761a032c5c21029f9cadcf93be7804e2399b25a
			GraphicInterface.todas.menu.show();
		}
    }

<<<<<<< HEAD
}
=======
}


   
   
    
>>>>>>> 6761a032c5c21029f9cadcf93be7804e2399b25a
