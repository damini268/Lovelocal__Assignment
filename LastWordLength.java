package internship;

import java.util.Scanner;

public class LastWordLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = lengthOfLastWord(input);
        System.out.println("Length of the last word: " + result);
    }

    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // The length of the last word is the length of the string
        // from the last space index to the end of the string
        return s.length() - lastSpaceIndex - 1;
    }
}
