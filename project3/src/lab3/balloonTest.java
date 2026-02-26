package lab3;

import org.junit.Test;
import static org.junit.Assert.*;

import balloon.Balloon;

public class balloonTest
{
    @Test
    public void testInitial()
    {
        Balloon b = new Balloon(5);
        assertEquals(false, b.isPopped());
    }

    @Test
    public void testInitialRadius()
    {
        Balloon b = new Balloon(5);
        assertEquals(0, b.getRadius());
    }

    @Test
    public void testBlowRadius()
    {
        Balloon b = new Balloon(10);
        b.blow(5);
        assertEquals(false, b.isPopped());
        assertEquals(5, b.getRadius());
    }

    @Test
    public void testBlowRadiusLimit()
    {
        Balloon b = new Balloon(10);
        b.blow(10);
        assertEquals(false, b.isPopped());
        assertEquals(10, b.getRadius());
    }

    @Test
    public void testPoppedBallon()
    {
        Balloon b = new Balloon(10);
        b.pop();
        assertEquals(true, b.isPopped());
    }

    @Test
    public void testPoppedBallonRadius()
    {
        Balloon b = new Balloon(10);
        b.pop();
        assertEquals(0, b.getRadius());
    }

    @Test
    public void testBlowandPop()
    {
        Balloon b = new Balloon(7);
        b.blow(10);
        assertEquals(true, b.isPopped());
        assertEquals(0, b.getRadius());
    }

    @Test
    public void testDeflate()
    {
        Balloon b = new Balloon(100);
        b.blow(75);
        b.deflate();
        assertEquals(0, b.getRadius());
    }
}
