package org.example.String;

public class _2_PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("original string: " + str);
        System.out.println("reversed string: " + reverse);

        if (str.equals(reverse)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}
