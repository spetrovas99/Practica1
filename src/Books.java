
public class Books extends Product {
	protected enum lan{ es,en,fr,it,ger};
	protected String title;
	protected String author;
	protected int isbn;
	protected lan language;
	
	Books(String title,String author,int isbn, lan language){
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.language = language;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public lan getLanguage() {
		return language;
	}
	public void setLanguage(lan language) {
		this.language = language;
	}
	
	
}
