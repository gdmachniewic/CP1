
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your first name? ");
		String firstname = kin.nextLine();
 		
		System.out.print("What is your last name? ");
		String lastname = kin.nextLine();

		System.out.println("Hello " + firstname + lastname + ", it's nice to meet you!");
		
	}
}
