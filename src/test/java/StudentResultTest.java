import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentResultTest {

    @Test
    public void testPassCase() {
        StudentResult sr = new StudentResult();
        assertEquals("Pass", sr.checkResult(50));
    }

    @Test
    public void testFailCase() {
        StudentResult sr = new StudentResult();
        assertEquals("Fail", sr.checkResult(20));
    }
}