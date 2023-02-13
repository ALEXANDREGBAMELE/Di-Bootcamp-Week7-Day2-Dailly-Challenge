
public class Author {
//	Variable
	private String name;
	private String email;
	private char gender;
	
//	Constructor
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	
//	Getters and setters
	
	public String getName() {
		return name;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	// Methode 

	@Override
	public String toString() {
		return  name +"("+ gender +")" + " at " + email ;
	}
	
}


