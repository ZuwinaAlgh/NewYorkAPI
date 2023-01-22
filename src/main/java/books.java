
public class books {
	String title;
	String author;
	String description ;
	String book_uri;
	buy_links[]buy_links;
	
	
    public buy_links[] getBuy_links() {
		return buy_links;
	}
	public void setBuy_links(buy_links[] buy_links) {
		this.buy_links = buy_links;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBook_uri() {
		return book_uri;
	}
	public void setBook_uri(String book_uri) {
		this.book_uri = book_uri;
	}
	
	
}
