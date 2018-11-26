import java.util.Properties;
import java.io.FileReader;
public class ChangeLanguage {
	static protected Properties esp = new Properties();
	static protected Properties en = new Properties();
	
	static protected String introduceEmail;
	static protected String introduceUser;
	static protected String introducePassword;
	static protected String isPremium;
	static protected String notPremium;
	static protected String introduceCredit;
	static protected String checkEmailCode;
	static protected String badCode;
	static protected String checkEmail;
	static protected String badLogin;
	static protected String badCredit;
	static protected String summary;
	static protected String name; 
	static protected String price;
	static protected String language;
	static protected String changeCurrency;
	static protected String whatCurrency;
	static protected String shoppingList;
	static protected String noItem;
	static protected String searchCategory;
	static protected String searchProduct;
	static protected String notFound;
	static protected String welcome;
	static protected String buy;
	static protected String showCatalog;
	static protected String showProductList;
	static protected String close;
	static protected String buyQ;
	static protected String bye;
	static protected String choose;
	static protected String notStock;
	static protected String clothes;
	static protected String sports;
	static protected String	books ;
	static protected String films;
	static protected String socks ;
	static protected String t_shirt;
	static protected String pants;
	static protected String racket;
	static protected String	ball ;
	static protected String swimsuit ;
	static protected String The_ugly_Duckling ;
	static protected String	Total_recall ;
	static protected String spanish ;
	static protected String english ;
	static protected String	french;
	static protected String italian;
	static protected String	german;
	
	static void changeSpanish(){
		 FileReader read = null ;
		try{
			String path = new String("/Users/stefanipetrova/Documents/workspace/Practica1/src/español.txt");
			 read = new FileReader(path);
			 esp.load(read);
			 introduceEmail = esp.getProperty("introduceEmail");
			 introduceUser = esp.getProperty("introduceUser");
			 introducePassword = esp.getProperty("introducePassword");
			 isPremium = esp.getProperty("isPremium");
			 notPremium = esp.getProperty("notPremium");
			 introduceCredit = esp.getProperty("introduceCredit");
			 checkEmailCode = esp.getProperty("checkEmailCode");
			 badCode = esp.getProperty("badCode");
			 checkEmail = esp.getProperty("checkEmail");
			 badLogin = esp.getProperty("badLogin");
			 badCredit = esp.getProperty("badCredit");
			 summary = esp.getProperty("summary");
			 name = esp.getProperty("name");
			 price = esp.getProperty("price");
			 language = esp.getProperty("language");
			 changeCurrency = esp.getProperty("changeCurrency");
			 whatCurrency = esp.getProperty("whatCurrency");
			 shoppingList = esp.getProperty("shoppingList");
			 noItem = esp.getProperty("noItem");
			 searchCategory = esp.getProperty("searchCategory");
			 searchProduct = esp.getProperty("searchProduct");
			 notFound = esp.getProperty("notFound");
			 welcome = esp.getProperty("welcome");
			 buy = esp.getProperty("buy");
			 showCatalog = esp.getProperty("showCatalog");
			 showProductList = esp.getProperty("showProductList");
			 close = esp.getProperty("close");
			 buyQ = esp.getProperty("buyQ");
			 bye = esp.getProperty("bye");
			 choose = esp.getProperty("choose");
			 notStock = esp.getProperty("notStock");
			 clothes = esp.getProperty("clothes");
			 sports = esp.getProperty("sports");
			 books = esp.getProperty("books");
			 films = esp.getProperty("films");
			 socks = esp.getProperty("socks");
			 t_shirt = esp.getProperty("t_shirt");
			 pants = esp.getProperty("pants");
			 racket = esp.getProperty("racket");
			 ball = esp.getProperty("ball");
			 swimsuit = esp.getProperty("swimsuit");
			 The_ugly_Duckling = esp.getProperty("The_ugly_Duckling");
			 Total_recall = esp.getProperty("Total_recall");
			 spanish = esp.getProperty("spanish");
			 english = esp.getProperty("english");
			 italian = esp.getProperty("italian");
			 german = esp.getProperty("german");
			 french = esp.getProperty("french");

		}catch(Exception e){
			System.out.println("error");
		}finally{
			try{
				read.close();
			}catch(Exception e){
				System.out.println("no se cierra");
			}
		}
	}
	static void changeEnglish(){
		 FileReader read = null ;
		try{
			 read = new FileReader("/Users/stefanipetrova/Documents/workspace/Practica1/src/english.txt");
			 en.load(read);
			 introduceEmail = en.getProperty("introduceEmail");
			 introduceUser = en.getProperty("introduceUser");
			 introducePassword = en.getProperty("introducePassword");
			 isPremium = en.getProperty("isPremium");
			 notPremium = en.getProperty("notPremium");
			 introduceCredit = en.getProperty("introduceCredit");
			 checkEmailCode = en.getProperty("checkEmailCode");
			 badCode = en.getProperty("badCode");
			 checkEmail = en.getProperty("checkEmail");
			 badLogin = en.getProperty("badLogin");
			 badCredit = en.getProperty("badCredit");
			 summary = en.getProperty("summary");
			 name = en.getProperty("name");
			 price = en.getProperty("price");
			 language = en.getProperty("language");
			 changeCurrency = en.getProperty("changeCurrency");
			 whatCurrency = en.getProperty("whatCurrency");
			 shoppingList = en.getProperty("shoppingList");
			 noItem = en.getProperty("noItem");
			 searchCategory = en.getProperty("searchCategory");
			 searchProduct = en.getProperty("searchProduct");
			 notFound = en.getProperty("notFound");
			 welcome = en.getProperty("welcome");
			 buy = en.getProperty("buy");
			 showCatalog = en.getProperty("showCatalog");
			 showProductList = en.getProperty("showProductList");
			 close = en.getProperty("close");
			 buyQ = en.getProperty("buyQ");
			 bye = en.getProperty("bye");
			 choose = en.getProperty("choose");
			 notStock = en.getProperty("notStock");
			 clothes= en.getProperty("clothes");
			 sports = en.getProperty("sports");
			 books = en.getProperty("books");
			 films = en.getProperty("films");
			 socks = en.getProperty("socks");
			 t_shirt = en.getProperty("t_shirt");
			 pants = en.getProperty("pants");
			 racket = en.getProperty("racket");
			 ball = en.getProperty("ball");
			 swimsuit = en.getProperty("swimsuit");
			 The_ugly_Duckling = en.getProperty("The_ugly_Duckling");
			 Total_recall = en.getProperty("Total_recall");
			 spanish = en.getProperty("spanish");
			 english = en.getProperty("english");
			 italian = en.getProperty("italian");
			 german = en.getProperty("german");
			 french = en.getProperty("french");
		
		}catch(Exception e){
			System.out.println("error");
		}finally{
			try{
				read.close();
			}catch(Exception e){
				System.out.println("not close");
			}
		}
	}
}
