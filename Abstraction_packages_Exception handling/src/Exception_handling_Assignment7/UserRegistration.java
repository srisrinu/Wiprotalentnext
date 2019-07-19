package Exception_handling_Assignment7;
import java.util.Scanner;
import Exception_handling_Assignment7.InvalidCountryException;
public class UserRegistration {
	String Username,UserCountry;
	public void registerUser(String Username,String UserCountry) throws InvalidCountryException{
		if(UserCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException();
		}
	}
	public static void main(String[]args) {
		UserRegistration user=new UserRegistration();
		Scanner sc=new Scanner(System.in);
		String Username=sc.nextLine();
		String UserCountry=sc.nextLine();
		try {
			
		
		user.registerUser(Username, UserCountry);
		
	}catch(InvalidCountryException e) {
		
	}

	}
}
