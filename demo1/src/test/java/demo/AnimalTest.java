package demo;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class AnimalTest {

    @Test
    public void TestAge()
    {
        Animals testAni = new Animals();
        assertEquals(0, testAni.getAge());
    }
}
