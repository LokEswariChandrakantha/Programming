package Programs;

public class PalindromeNumber {

    public static void main(String[] args) {

        int n = 121;
        int original = n;
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }

        if (original == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}