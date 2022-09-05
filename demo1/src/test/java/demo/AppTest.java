package demo;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestZero()
    {
        App testZero = new App();
        int zero = testZero.fibonacci(0);
        assertEquals(0, zero);
    }

    @Test
    public void TestOne()
    {
        App testOne = new App();
        int one = testOne.fibonacci(1);
        assertEquals( 1, one);
    }

    @Test
    public void TestOtherNum()
    {
        App test = new App();
        int other = test.fibonacci(3);
        //System.out.println(other);
        assertEquals( 2, other);
    }
}
