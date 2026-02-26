package lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasketballTests
{
    private static final double EPSILON = 10e-07;

    @Test
    public void testInitial()
    {
        String msg = "A newly constructed basketball should have the diameter it was contructed with";
        Basketball b = new Basketball(5);
        assertEquals(msg,false, b.isDribbleable());
    }

    @Test
    public void testInitialDiameter()
    {
        Basketball b = new Basketball(5);
        assertEquals(5.0, b.getDiameter(), EPSILON);
    }

    @Test
    public void testInflate()
    {
        Basketball b = new Basketball(5);
        b.inflate();
        assertEquals(true, b.isDribbleable());
    }

    @Test
    public void testDiameterAfterInflation()
    {
        Basketball b = new Basketball(5);
        b.inflate();
        assertEquals(5.0, b.getDiameter(), EPSILON);
    }
}
