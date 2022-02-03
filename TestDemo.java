import static org.junit.Assert.*;
import org.junit.*;

public class TestDemo {
    @Test
    public void subtract() {
        assertEquals(1, Demo.subtraction(4, 2));
    }
}
