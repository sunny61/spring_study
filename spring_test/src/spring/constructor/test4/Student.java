package spring.constructor.test4;

public class Student {
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student() {
		super();
		System.out.println("默认Student");
	}

	public Student(Book book) {
		super();
		this.book = book;
		System.out.println("自定义Student");
	}

}
