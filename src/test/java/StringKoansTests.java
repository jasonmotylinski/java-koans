import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by developer on 1/12/17.
 */
public class StringKoansTests {
    @Test
    public void StringHasOnlyUniqueCharacters() {
        assertTrue(StringKoans.isUnique("asfd"));
    }

    @Test
    public void StringDoesNotHaveUniqueCharacters() {
        assertFalse(StringKoans.isUnique("asfdd"));
    }

    @Test
    public void StringIsPermutation(){
        assertTrue(StringKoans.isPermutation("god", "dog"));
    }

    @Test
    public void StringIsNotPermutation(){
        assertFalse(StringKoans.isPermutation("god", "catdog"));
    }

    @Test
    public void StringIsPalindrome(){
        assertTrue(StringKoans.isPalindrome("nursesrun"));
    }

    @Test
    public void StringIsNotPalindrome(){
        assertFalse(StringKoans.isPalindrome("not a palindrome"));
    }
}
