import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp()  {
        visitor = new Visitor("Bob", 20, 1.6, 10.20);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", visitor.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.6, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(10.20, visitor.getMoney(), 0.1);
    }
}
