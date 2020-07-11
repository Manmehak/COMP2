
public class Program {
	public static Person person;  // reference to the person class , person is the object here 
	public static void main(String[] args) {
		System.out.println("Program Started... ");
		 
        person = new Person(18);
        person.setGender("Male");
        person.setName("Manmehak");
        System.out.println( person.getName() + " gender is " + person.getGender());
        person.runs();
        System.out.printf("%s is %d ",person.getName(), person.getAge());
	}

}
