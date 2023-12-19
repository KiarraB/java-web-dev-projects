package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsNotFacingEachotherReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsFacingEachotherReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void evenNumberOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsInStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    //Dont think 2 below will work
    @Test
    public void balancedBracketsDoesNotEqual0ReturnsFalse() {

    }

    @Test
    public void balancedBracketsEquals0ReturnsTrue() {

    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Blah]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]"));
    }

    @Test
    public void sameNumberOfEachLeftAndRightBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    @Test
    public void unequalNumberOfLeftAndRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }
}