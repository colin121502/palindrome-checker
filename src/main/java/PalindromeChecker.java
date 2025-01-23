public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedWord = new StringBuilder(cleanWord).reverse().toString();
        return cleanWord.equals(reversedWord);
    }
}
