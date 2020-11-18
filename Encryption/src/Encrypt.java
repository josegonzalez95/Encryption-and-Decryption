import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the letter 'E' to encrypt message or the letter 'D' decrypt message: ");
		String mode = scan.nextLine();
		

		if(mode.toUpperCase().charAt(0) == 'E') {
			System.out.print("Enter message to be encrypted: ");
			String text = scan.nextLine();
			System.out.print("Enter any number form 0-9 as your key: ");
			int key = scan.nextInt();
			System.out.println(text);	
			encryptor(text, key);
			
		} else if(mode.toUpperCase().charAt(0) == 'D') {
			
			System.out.print("Enter message to be decrypted: ");
			String text = scan.nextLine();
			System.out.print("Enter any number form 0-9 as your key: ");
			int key = scan.nextInt();
			System.out.println(text);	
			decryptor(text, key);
			
		}
	}
	public static void encryptor(String text, int key) {
		char[] chars = text.toCharArray();

		for(char c: chars) {
			c = (char) (c+key+3);
			System.out.print(c);
		}
	}
	
	public static void decryptor(String text, int key) {
		char[] chars = text.toCharArray();

		for(char c: chars) {
			c = (char) (c-key-3);
			System.out.print(c);
		}
	}
}
