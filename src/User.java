import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	protected String email;
	protected String password;
	protected String login;
	protected boolean premium;
	protected String credit;
	User(){
		email=null;
		password=null;
		login=null;
		premium=false;
		credit = null;
	}
	User(String email, String password,String login,String credit,boolean premium){
		this.email = email;
		this.password = password;
		this.login = login;
		this.premium =premium;
		this.credit= credit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getPremium() {
		return premium;
	}
	 public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public String getCredir() {
		return credit;
	}
	public void setCredit(String credir) {
		this.credit=credit;
	}
	void sign_up(){
		do{
		Scanner tec = new Scanner(System.in);
		System.out.println("Indroduce tu correo");
		email=tec.nextLine();
		System.out.println("Indroduce tu usuario(con más de 7 caracteres)");
		login=tec.nextLine();
		System.out.println("Indroduce tu contraseña(con más de 7 caracteres)");
		password=tec.nextLine();
		System.out.println("Quiere ser premium?(true/false)");
		premium=tec.nextBoolean();
		if(premium ==true){
			Scanner tecs = new Scanner(System.in);
			System.out.println("Introduza su tarjeta de crédito");
			credit=tecs.nextLine();
		}
		else{
			System.out.println("Más adelante puede ser premium");	
		}
		}while(error());
		System.out.println("Bienvenido!!");
	}
	boolean error(){
		boolean aux=false;
		String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
			      "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		if (email != null) {
			   Matcher matcher = pattern.matcher(email);
			   if (!matcher.matches()) {
			     System.out.println("Error");
			     aux=true;
			  }
		}
		if(password.length()<7){
			System.out.println("Error");
			aux= true;
		}
		if(login.length()<7){
			System.out.println("Error");
			aux=true;
		}
		if(credit!=null)
			if(credit.length()<10 ){
			System.out.println("Error");
			aux=true;
		}
		return aux;
	}
}
