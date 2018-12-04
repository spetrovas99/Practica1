
	import java.util.Random;

import javafx.fxml.FXML;
	import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

	public class Email {
		final static int num = random();
	    @FXML
	    private Label hiId;
	   
	    @FXML
	    private Label toId;
	    
	    @FXML
	    private Label createCode;
	    
	    static int random(){
			Random rnd = new Random();
			int num = (rnd.nextInt((int)System.currentTimeMillis())%90000) + 10000;
			return num;
		}

	   @FXML
	   private void chng(MouseEvent event){
		   toId.setText("to: "+ Controller.email);
		   hiId.setText("Hi " + Controller.user);
		   createCode.setText("Your code is: " + LoginEmail.x);
	   }
}
