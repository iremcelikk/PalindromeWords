import java.util.Scanner;

public class PalindromeWords {

	static boolean isPalindrome(String word) {
		int i = 0, j = word.length() - 1;
		while (i < j) {
			if (word.charAt(i) != word.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("Type a word to see whether the word is palindrome");
		word = sc.nextLine();

		while (!word.equals("exit")) {
			if (isPalindrome(word))
				System.out.println(word + " is palindrome.");
			else
				System.out.println(word + " is not palindrome.");
			System.out.println("Type a word to see whether the word is palindrome");
			word = sc.nextLine();
		}
	}

}