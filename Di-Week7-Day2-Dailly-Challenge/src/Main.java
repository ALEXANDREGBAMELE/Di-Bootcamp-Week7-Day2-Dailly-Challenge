
public class Main {

	public static void main(String[] args) {
		Author author = new Author("Soro Guefala", "soroguefala@gmail.com", 'M');
		Book book = new Book("Le Village de la honte ", (String)author.getName(),2500.4, 1);
		System.out.println(book.toString());
	}
}
