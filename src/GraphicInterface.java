public class GraphicInterface {
	static TodasGraphicInterface todas = new TodasGraphicInterface();
	
	static void esperar(int mili){
		try{
			Thread.sleep(mili);
		}catch(InterruptedException e){
			System.out.println("error");
		}
	}
	
	public static void main(String[] args) {
		todas.launcher();
	}
}
