import java.io.FileWriter;

public class TicketEmail implements Files {
Product product;

TicketEmail(Product product){
	this.product = product;
}

	@Override
	public void sendMail() {
		FileWriter fw = null;
		try{
			fw = new FileWriter("tiquet-" + product.getName() + ".txt");
			fw.write("AMAZON" + "\r\n" +"From: hello@amazons.com" + "\r\n"+ "To: " + User.getUser().email + "\r\n");
			fw.write("Subject: Your purchase" + "\r\n" );
			fw.write("Hello " + User.getUser().login + "\r\n");
			fw.write("SUMMARY" + "\r\n" );
			fw.write("Name:" + product.getName() + "\r\n");
			fw.write((User.getUser().getPremium())? "Price: " + String.format("%.2f",product.getPrice()) :"Price: " + String.format("%.2f",product.getPricenop()));
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
