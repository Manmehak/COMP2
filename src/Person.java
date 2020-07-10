
public class Person {
	// Added instance variables 
	private String _gender;
	private String _name;
	private int _age;
	
	//To hide info we used public prop and private instance variables such as public get and set and private variables.
	
	// Getters and setters methods 
	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}
	
	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
	//Adding Constructor
	public Person(int age) {
		this._age = age;
		
	}
	//Adding public method 
	public void runs() {
		System.out.printf("%s Runs" , this._name);
	}
	
	

}
