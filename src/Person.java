
public class Person {
	// Added instance variables 
	private String _gender;
	private String _name;
	private int _age;
	
	//To hide info we used public prop and
	//private instance variables such as public get and set and private variables.
	
	// Getters and setters methods 
	public String getGender() {
		return this._gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}
	
	public String getName() {
		return this._name;
	}

	public void setName(String name) {
		this._name = name;
	}
	// read only memory means no write but just read 
	public int getAge() {
		return this._age;		
	}
	
	//Adding Constructor
	public Person(int age) {
		this._initialise(age, "Unknown", "Unknown");
		
	}
	//Adding private method 
	private void _initialise(int age , String name , String gender) {
		this.setName(name);
		this.setGender(gender);
		this._age = age;
	}
	
	//Adding public method 
	public void runs() {
		System.out.printf("%s runs\n" , this.getName());
	}
		
}
