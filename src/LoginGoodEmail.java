import java.io.FileWriter;

public class LoginGoodEmail implements Files {

	@Override
	public void sendMail() {
			 FileWriter fw = null;
			try{
				fw = new FileWriter("cordial.txt");
				fw.write("AMAZON" + "\r\n" +"From: hello@amazons.com" + "\r\n"+ "To: " + User.getUser().email + "\r\n");
				fw.write("Subject: Wellcome." + "\r\n" );
				fw.write("Dear " + User.getUser().login + "\r\n");
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
}
