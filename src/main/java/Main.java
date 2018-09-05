import test2.Account2;
import test.Account;


public class Main {

	public static void main(String[] args) {

		System.out.println("This is an implementation of a simple Builder pattern...");
		System.out.println("Pros: ");
		System.out.println("\t1. doesn't need c'tors with many parameters");
		System.out.println("\t2. prevents confusing parameters order");
		System.out.println("\t3. makes everything more readable");

		User u = new User.Builder()
				.withFirstName("Naor")
				.withLastName("Bar")
				.withTitle("R&D")
				.build();
		
		System.out.println("\nRES: " + u.toString());
		
		Account a = Account.builder().withId(1000).withName("nnn").build();
		System.out.println("\nRES: " + a.toString());
		
		Account2 a2 = new Account2.Builder().id(1001).name("nnn2").build();
		System.out.println("\nRES: " + a2.toString());
		
	}

}
