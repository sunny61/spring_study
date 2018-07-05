package spring.constructor.test3;

public class Book {
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book() {
		super();
	}

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}

}
