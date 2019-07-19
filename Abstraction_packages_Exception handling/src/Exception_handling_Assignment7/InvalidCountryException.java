package Exception_handling_Assignment7;

public class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException should be thrown.");
		System.out.println("User Outside India  cannot be registered");
	}

}
