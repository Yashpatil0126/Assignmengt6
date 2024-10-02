package assignment6;

public class TestPerson {

	public class Main {
		public static void main(String[] args) {
			Person person = new Person("John Doe", 30);

			System.out.println("Name: " + person.getName());
			System.out.println("Age: " + person.getAge());

			person.name = "Jane"; // This would result in a compilation error
			person.age = 35; // This would also result in a compilation error
		}
	}

}
