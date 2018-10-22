import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	protected String email;
	protected String password;
	protected String login;
	protected boolean premium;
	protected String credit;
	static User user;
	static List<User> users = new ArrayList<User>();
	List<Product> userProduct = new ArrayList<Product>();
	
	User(){
		email=null;
		password=null;
		login=null;
		premium=false;
		credit = null;
		user = this;
	}
	User(String email, String password,String login,String credit,boolean premium){
		this.email = email;
		this.password = password;
		this.login = login;
		this.premium =premium;
		this.credit= credit;
		Configuration.write(login, email, password);
		user = this;
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
	static void sign_up(){
		String email;
		String login;
		String password;
		String credit = null;
		boolean premium;
		do{
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce your email");
		email=tec.nextLine();
		System.out.println("Indroduce your user(at least 7 characters)");
		login=tec.nextLine();
		System.out.println("Indroduce tu contraseña(at least 7 characters)");
		password=tec.nextLine();
		System.out.println("Join premium?(true/false)");
		premium=tec.nextBoolean();
		if(premium ==true){
			Scanner tecs = new Scanner(System.in);
			System.out.println("Introduce your credit card");
			credit=tecs.nextLine();
		}
		else{
			System.out.println("later you can be premium");	
		}
		}while(error(login, email, password, credit));
		System.out.println("Welcome!!");
		User usuario = new User(email,password,login,credit,premium);
	}
	static boolean error(String login, String email, String password, String credit){
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
	void buy(Product product){
		
			Scanner tec = new Scanner(System.in);
			String res;
			if(product.stock > 0)
				product.stock --;
		
			product.mailPlus(product.price);
			finalPrice(product);
			System.out.println("SUMMARY");
			System.out.println("Name:" + product.name );
			System.out.print("Price:");
			System.out.printf("%.2f", product.price);
			System.out.println(product.getMny().toString());
			System.out.println("Change currency?(yes/no)");
			res=tec.nextLine();
			if(res.equals("yes")){
				System.out.println("to what currency?");
				System.out.println("1-euro");
				System.out.println("2-dolar");
				System.out.println("3-pound");
				res=tec.nextLine();
				switch(res){
				case"1":
					product.changeMoney(product.mny, Product.money.euro);
					System.out.printf("%.2f", product.price);
					System.out.println(product.getMny().toString());
					break;
				case "2":
					product.changeMoney(product.mny, Product.money.dollar);
					System.out.printf("%.2f", product.price);
					System.out.println(product.getMny().toString());
					break;
				case "3":
					product.changeMoney(product.mny,Product.money.pound );
					System.out.printf("%.2f", product.price);
					System.out.println(product.getMny().toString());
					break;
				}
			}
		
		user.userProduct.add(product);
	}
	void finalPrice(Product product){
		if (!getPremium()){
			product.price += product.mailPlus(product.price);	
		}
	}
	void printUserProducts(){
		System.out.println("Shoping list:");
		for (int i = 0; i < userProduct.size(); i++){
			System.out.println(userProduct.get(i).getName());
		}
		if (userProduct.size() == 0){
			System.out.println("There is no item in your list.");
		}
	}
}
