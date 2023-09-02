import java.util.Scanner;
public class checkBlank{

private static void checkBlank(String username) {
		for (int var = 0;var<username.length(); var++ ) {
			if ( username.charAt(var) == ' ' ) {
				
				continue;
				
			}
			System.out.print( username.charAt(var));
		}
	}

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String username = scan.nextLine();
		checkBlank(username);
		
		
	}
	
}