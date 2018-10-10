import java.io.FileReader;
import java.util.Properties;

public class Configuration {
	static void config(){
	String email= null;
	String username= null;
	String password= null;
	try(FileReader reader =  new FileReader("config")) {
        Properties properties = new Properties();
        properties.load(reader);
        
        username = properties.getProperty("username");
	    email = properties.getProperty("email");
	    password = properties.getProperty("password");

    } catch (Exception e) {;
  	    e.printStackTrace();
    }
	System.out.println(email);
    System.out.println(username);
    System.out.println(password);

	}

}
