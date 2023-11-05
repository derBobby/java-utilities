package eu.planlos.javautilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanStringsUtilityTest {

    /*
     * Test only to experiment with maven libraries and dependency conflicts
     */
    @Test
    public void normalizationOfOE_isCorrect() {
        assertEquals("Oe", GermanStringsUtility.normalizeGermanCharacters("Ö"));
        assertEquals("oe", GermanStringsUtility.normalizeGermanCharacters("ö"));
    }
}