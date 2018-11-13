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
	protected int credit;
	static User user;
	static List<User> users = new ArrayList<User>();
	List<Product> userProduct = new ArrayList<Product>();
	 
	static int devInt (String c){
		int n ;
		try{
			n = Integer.parseInt(c);
		}catch(NumberFormatException e){
			n = 0; 
		}
		return n;
	}
	
	User(String email, String password,String login,int credit,boolean premium){
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
	public int getCredit() {
		return credit;
	}
	public void setCredit(String credir) {
		this.credit=credit;
	}
	static void sign_up() throws BooleanException{
		String email;
		String login;
		String password;
		int credit = 0;
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
		String bool;
		try{
			bool = tec.nextLine();
			if(!bool.equals("true") && !bool.equals("false")){
				throw new BooleanException();
			}
		} catch (BooleanException e){
			bool = "false";
			System.out.println("You are not premium.");
		}
		premium = Boolean.parseBoolean(bool);
		if(premium ==true){
			Scanner tecs = new Scanner(System.in);
			System.out.println("Introduce your credit card");
			String c = tec.nextLine();
			credit = devInt(c);
		}
		}while(error(login, email, password, credit, premium));
		  user = new User(email,password,login,credit,premium);
	
	}
	static void code(){
		 Scanner tec = new Scanner(System.in);
		 boolean good = false;
		 System.out.println("Check your email and enter your code :");
		 int num = tec.nextInt();
		 do{
			 if(num != File.x){
				 System.out.println("sorry, your code is invalid, introduced again.");
			 }else{
				 good = true;
			 }
		 }while(!good);
		 System.out.println("Check your email.");
	 }
	static boolean error(String login, String email, String password, int credit, boolean premium) throws BooleanException{
		boolean aux=false;
		String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@" +
			      "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
		Pattern pattern = Pattern.compile(emailPattern);
		if (email != null) {
			   Matcher matcher = pattern.matcher(email);
			   if (!matcher.matches()) {
			     System.out.println("Token error.");
			     aux=true;
			  }
		}
		if(password.length()<7 || login.length()<7){
			System.out.println("Error, introduce again your login");
			aux= true;
		}
		if(credit == 0 && premium){
			aux = true;
			System.out.println("Credit error.");
		}
		
		return aux;
	}
	void buy(Product product){
			Scanner tec = new Scanner(System.in);
			String res;
			if(product.stock > 0){
				product.stock --;
			}
			System.out.println("SUMMARY");
			System.out.println("Name: " + product.getName());
			System.out.print("Price:");
			if(User.user.premium){
				System.out.printf("%.2f", product.price);
			}else{
				System.out.printf("%.2f", product.pricenop);
			}
			System.out.println(product.getMny().toString());
			if(product.cat.getName().equals("Books")){
				System.out.print("Language:");
				Books book = (Books)product;
				book.printLanguage();
			}
			System.out.println("Change currency?(yes/no)");
			res=tec.nextLine();
			if(res.equals("yes")){
				System.out.println("To what currency?");
				System.out.println("1-euro");
				System.out.println("2-dolar");
				System.out.println("3-pound");
				res=tec.nextLine();
				switch(res){
				case"1":
					product.changeMoney(product.mny, Product.money.euro);
					if(premium){
					System.out.printf("%.2f", product.price);
					System.out.println(product.getMny().toString());
					}else{
						System.out.printf("%.2f", product.pricenop);
						System.out.println(product.getMny().toString());
					}
					break;
				case "2":
					product.changeMoney(product.mny, Product.money.dollar);
					if(premium){
					System.out.printf("%.2f", product.price);
					System.out.println(product.getMny().toString());
					}else{
						System.out.printf("%.2f", product.pricenop);
						System.out.println(product.getMny().toString());
					}
					break;
				case "3":
					product.changeMoney(product.mny,Product.money.pound );
					if(premium){
					System.out.printf("%.2f", product.price);
					System.out.println(product.getMny().toString());
					}else{
						System.out.printf("%.2f", product.pricenop);
						System.out.println(product.getMny().toString());
					}
					break;
				}
			}
		user.userProduct.add(product);
	}
	void printUserProducts(){ 
		 
		System.out.println("Shoping list:");
		for (int i = 0; i < userProduct.size(); i++){
			System.out.print(userProduct.get(i).getName() + " ");
			if(premium){
			System.out.printf("%.2f",userProduct.get(i).getPrice() );
			System.out.println(" " + userProduct.get(i).getMny().toString());
			}else{
				System.out.printf("%.2f",userProduct.get(i).getPricenop() );
				System.out.println(" " + userProduct.get(i).getMny().toString());
			}
		}
		if (userProduct.size() == 0){
			System.out.println("There is no item in your list.");
		}
	}
}
