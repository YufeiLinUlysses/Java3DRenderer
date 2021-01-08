import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    @Test
    public void Tuple_Add() throws Exception {
        Tuple t1 = new Tuple(3,-2,5,1);
        Tuple t2 = new Tuple(-2,3,1,0);
        Tuple ans = new Tuple(1,1,6,1);
        assertEquals(ans,t1.add(t2));
    }
}