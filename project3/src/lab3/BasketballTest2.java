package lab3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketballTest2
{
    private static  final double EPSILON = 10e-07;

    private Basketball bb;

    @Before
    public void setup()
    {
        bb = new Basketball(5);
    }

    @Test
    public void testInitial()
    {
        assertEquals(false, bb.isDribbleable());
    }

    @Test
    public void testInitialDiameter()
    {
        assertEquals(5.0, bb.getDiameter(), EPSILON);
    }

    @Test
    public void testInflate()
    {
        bb.inflate();
        assertEquals(true, bb.isDribbleable());
    }

    @Test
    public void testDiameterAfterInflation()
    {
        bb.inflate();
        assertEquals(5.0, bb.getDiameter(), EPSILON);
    }
}
