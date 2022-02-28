import java.util.Scanner;

public class ValidInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Type in an integer between 50 and 300");
		int input = scanner.nextInt();
		
		
		while (input < 50 || input > 300) {
			
			System.out.println("Oops, that number wasn't between 50 and 300. Try again.");
			input = scanner.nextInt();
		}
		
		System.out.println("The number you typed in was: " + input);
		}

}
