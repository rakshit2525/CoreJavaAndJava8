package coreJavaTopics.collection_framework.mapInterface.linkedHashMap.realtimeExample;

public class Books {
	
	long isbn_number;
	String book_name;
	String book_description;
	double book_price;
	
	public Books(long isbn_number, String book_name, String book_description, double book_price) {
		super();
		this.isbn_number = isbn_number;
		this.book_name = book_name;
		this.book_description = book_description;
		this.book_price = book_price;
	}

	
	
	public long getIsbn_number() {
		return isbn_number;
	}



	public void setIsbn_number(long isbn_number) {
		this.isbn_number = isbn_number;
	}



	public String getBook_name() {
		return book_name;
	}



	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}



	public String getBook_description() {
		return book_description;
	}



	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}



	public double getBook_price() {
		return book_price;
	}



	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}



	@Override
	public String toString() {
		return "Books [isbn_number=" + isbn_number + ", book_name=" + book_name + ", book_description="
				+ book_description + ", book_price=" + book_price + "]";
	}
	
}
