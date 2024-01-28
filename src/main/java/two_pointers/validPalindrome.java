package two_pointers;

class validPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder reverseString = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().contentEquals(reverseString.reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
