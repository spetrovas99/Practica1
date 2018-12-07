import java.io.FileWriter;
import java.util.Random;

public class LoginEmail implements Files{
	
	static int random(){
		Random rnd = new Random(System.currentTimeMillis());
		int num = (rnd.nextInt() % 90000) + 10000;
		return num;
	}
	static int x;
	@Override
	public void sendMail() {
		x = random();
		 FileWriter fw = null;
		try{
			fw = new FileWriter("Amazon.txt");
			fw.write("AMAZON" + "\r\n" +"From: hello@amazons.com" + "\r\n"+ "To: " + User.getUser().email + "\r\n");
			fw.write("Hi " + User.getUser().login + "\r\n");
			fw.write("Use this code for activate your account "+ x + "\r\n");
			fw.write("1-Copy this code." +  "\r\n" + "2-Go to the application." + "\r\n" + "3-Paste the code." + "\r\n" );
			fw.write("Do not respond to this message, it is automatic.");
		}catch(Exception e){
			System.out.println("Error");
		}finally{
			try{
				fw.close();
			}catch(Exception e){
				System.out.println("ERROR, your file has nt been closed.");
			}
		}
	}
}
