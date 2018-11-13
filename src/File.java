import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
public class File {
	static int random(){
		Random rnd = new Random();
		int num = (rnd.nextInt((int)System.currentTimeMillis())%90000) + 1000;
		return num;
	}
	static int x;
	 static void newemail(){
		 x = random();
		 FileWriter fw = null;
		try{
			fw = new FileWriter("Amazon.txt");
			fw.write("AMAZON" + "\r\n" +"From: hello@amazons.com" + "\r\n"+ "To: " + User.user.email + "\r\n");
			fw.write("Hi " + User.user.login + "\r\n");
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
	 static void newemail2(){
		 FileWriter fw = null;
		try{
			fw = new FileWriter("cordial.txt");
			fw.write("AMAZON" + "\r\n" +"From: hello@amazons.com" + "\r\n"+ "To: " + User.user.email + "\r\n");
			fw.write("Subject: Wellcome." + "\r\n" );
			fw.write("Dear " + User.user.login + "\r\n");
			fw.write("Completed registration." + "\r\n" + "Your profile is activated."+ "\r\n");
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
	 static void tiquet(Product product){
		 FileWriter fw = null;
		try{
			fw = new FileWriter("tiquet-" + product.getName() + ".txt");
			fw.write("AMAZON" + "\r\n" +"From: hello@amazons.com" + "\r\n"+ "To: " + User.user.email + "\r\n");
			fw.write("Subject: Your purchase" + "\r\n" );
			fw.write("Hello " + User.user.login + "\r\n");
			fw.write("SUMMARY" + "\r\n" );
			fw.write("Name:" + product.getName() + "\r\n");
			fw.write((User.user.getPremium())? "Price: " + String.format("%.2f",product.getPrice()) :"Price: " + String.format("%.2f",product.getPricenop()));
			fw.write(product.getMny().toString() + "\r\n");
			fw.write("Deliver date: " + Product.time());
		}catch(Exception e){
			System.out.println("Error");
		}finally{
			try{
				fw.close();
			}catch(Exception e){
				System.out.println("ERROR, your file hasnt been closed.");
			}
		}
	 }
}
