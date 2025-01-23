import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("racecar")); // Simple palindrome
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama")); // Phrase palindrome
        assertFalse(checker.isPalindrome(null)); // Null input
        assertFalse(checker.isPalindrome("hello")); // Non-palindrome
    }
}
