

public class Book{
private String name;
private String author;	
private double price;
private int qty;

//Constructor without parametter

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

//Constructor with parametters
public Book(String name, String author, double price, int qty) {
	super();
	this.name = name;
	this.author = author;
	this.price = price;
	this.qty = qty;
}

//Getters and Setters
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

@Override
public String toString() {
	return name + author.toString();
}

//Methodes


}
