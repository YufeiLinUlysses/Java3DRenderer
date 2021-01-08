import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {

    @Test
    void doubleEqual() {
        General g = new General();
        double a = 1;
        double b = 2;
        assertEquals(g.doubleEqual(a,b,0.001), false);
        assertEquals(g.doubleEqual(a,b), false);
    }
}