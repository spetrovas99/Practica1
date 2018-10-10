import java.io.FileReader;
import java.util.Properties;
import java.io.FileWriter;
public class Configuration {
	static void read(){
		String email= null;
		String username= null;
		String password= null;
		try(FileReader reader =  new FileReader("config")) {
			Properties properties = new Properties();
			properties.load(reader);
        
			username = properties.getProperty("username");
			email = properties.getProperty("email");
			password = properties.getProperty("password");

		} catch (Exception e) {
  	    	e.printStackTrace();
		}
		System.out.println(email);
		System.out.println(username);
		System.out.println(password);
	}
	static void write(String username, String email, String password){
		try(FileWriter write = new FileWriter("config")){
			Properties properties = new Properties();
			properties.setProperty("username", username);
			properties.setProperty("email", email);
			properties.setProperty("password", password);
			properties.store(write, "sin mas");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
}