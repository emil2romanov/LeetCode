package easy;

/*Given an integer x, return true if x is a
        palindrome
        , and false otherwise.*/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        String reversedNumber = "";
        int length = number.length();

        for (int i = (length - 1); i >= 0 ; --i) {
            reversedNumber = reversedNumber  + number.charAt(i);
        }
        if (number.equals(reversedNumber)) {
            return true;
        } else {
            return false;
        }
    }
}
