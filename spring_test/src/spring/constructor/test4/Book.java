package spring.constructor.test4;

public class Book {
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Book() {
		System.out.println("Book默认构造方法：" + bookName);
	}

	public Book(String bookName) {
		super();
		this.bookName = bookName;
		System.out.println("Book自定义构造方法：" + bookName);
	}

}
