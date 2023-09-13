package two_pointers;

class validPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder reverseString = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        if (s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().equals(reverseString.reverse().toString())) {
            return true;
        } else
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
