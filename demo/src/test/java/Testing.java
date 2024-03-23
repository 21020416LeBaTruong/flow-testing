import static org.junit.Assert.assertEquals;
import static com.example.Main.price;

import org.junit.Test;

public class Testing {
    @Test
    public void boundary_testing1() {
        assertEquals(-1, price(-1));
    }

    @Test
    public void boundary_testing2() {
        assertEquals(30, price(1));
    }

    @Test
    public void boundary_testing3() {
        assertEquals(60, price(2));
    }

    @Test
    public void boundary_testing4() {
        assertEquals(110, price(4));
    }

    @Test
    public void boundary_testing5() {
        assertEquals(130, price(5));
    }

    @Test
    public void boundary_testing6() {
        assertEquals(185, price(8));
    }

}
