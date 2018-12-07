
	import java.util.Random;

import javafx.fxml.FXML;
	import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

	public class ControllerEmail {
		final static int num = random();
	    @FXML
	    private Label hiId;
	   
	    @FXML
	    private Label toId;
	    
	    @FXML
	    private Label createCode;
	    
	    static int random(){
			Random rnd = new Random(System.currentTimeMillis());
			int num = (rnd.nextInt() % 90000) + 10000;
			return num;
		}

	   @FXML
	   private void chng(MouseEvent event){
		   toId.setText("to: "+ Controller.email);
		   hiId.setText("Hi " + Controller.user);
		   createCode.setText("Your code is: " + LoginEmail.x);
	   }
}
