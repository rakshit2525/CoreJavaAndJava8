package coreJavaTopics.collection_framework.mapInterface.treeMap.realtimeExample;

public class Books {

	long isbn_number;
	String author_name;
	String book_name;
	double book_price;
	
	public Books(long isbn_number, String author_name, String book_name, double book_price) {
		super();
		this.isbn_number = isbn_number;
		this.author_name = author_name;
		this.book_name = book_name;
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "Books [isbn_number=" + isbn_number + ", author_name="
				+ author_name + ", book_name=" + book_name + ", book_price=" + book_price + "]";
	}
	
}
