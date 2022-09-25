package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// declared a String
		String name = "madam";
		String rev = "";
		// For Loop for reverse a string
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		// compare both original string and reversed string
		if (name.equals(rev)) {
			System.out.println(" Palindrome");

		} else {
			System.out.println(" not Palindrome");

		}

	}

}
