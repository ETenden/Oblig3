import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void isDividedBy4ButNot100(){
        assertTrue(Main.isLeapYear(1880));
    }

    @Test
    public void isNotDividedBy400(){
        assertTrue(Main.isLeapYear(2000));
    }

    @Test
    public void isNotDividedBy4(){
        assertFalse(Main.isLeapYear(1717));
    }

    @Test
    public void IsDividedBy100ButNot400(){
        assertFalse(Main.isLeapYear(1900));
    }
}