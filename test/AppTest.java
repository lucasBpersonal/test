import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class AppTest {

    @Test
    public void testavoidDuplicatesInStringWithNullInput() {
        assertNull(App.avoidDuplicatesInString(null));
    }

    @Test
    public void testavoidDuplicatesInStringWithEmptyString() {
        assertEquals("", App.avoidDuplicatesInString(""));
    }

    @Test
    public void testavoidDuplicatesInStringWithoutDuplicates() {
        assertEquals("A1B2C3", App.avoidDuplicatesInString("A1B2C3"));
    }

    @Test
    public void testavoidDuplicatesInStringWithConsecutiveDuplicates() {
        assertEquals("ABCD123", App.avoidDuplicatesInString("AABBCCD112233"));
    }

    @Test
    public void testavoidDuplicatesInStringWithNonConsecutiveDuplicates() {
        assertEquals("ABCD123", App.avoidDuplicatesInString("ABCD123DCBA321"));
    }

    @Test
    public void testavoidDuplicatesInStringWithAllDuplicates() {
        assertEquals("A", App.avoidDuplicatesInString("AAAA"));
    }

    @Test
    public void testavoidDuplicatesInStringWithMixedCharacters() {
        assertEquals("A1B2C3!@", App.avoidDuplicatesInString("A1A1B2B2C3C3!!@@"));
    }
    
}
