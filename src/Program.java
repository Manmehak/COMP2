import java.util.Scanner;

public class Program {
	public static Person person;  // reference to the person class , person is the object here 
	public static void main(String[] args) {
		System.out.println("Program Started... ");
		
		int myAge;
		String myName;
		String myGender;
		Scanner input = new Scanner(System.in);
		
		//prompt user for age
		System.out.print("Enter your name: ");
		myName = input.nextLine();
		
		//prompt user for gender
		System.out.print("Enter your gender: ");
		myGender = input.nextLine();
				
		//prompt user for name 
		System.out.print("Enter your age: ");
		myAge = input.nextInt();
		
        person = new Person(myAge);
        person.setGender(myGender);
        person.setName(myName);
        System.out.println( person.getName() + " gender is " + person.getGender());
        person.runs();
        System.out.printf("%s is %d years old",person.getName(), person.getAge());
	}

}
