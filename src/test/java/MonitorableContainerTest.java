import model.Beer;
import model.BeerContainer;
import model.MonitorableContainer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class MonitorableContainerTest {

    private MonitorableContainer classUnderTest;

    @Before
    public void setUp(){
        this.classUnderTest = new BeerContainer("001", Beer.Lager, -5);
    }


    @Test
    public void testGetCode(){
        assertEquals("001", classUnderTest.getCode());
    }

    @Test
    public void testGetLoad(){
        assertEquals(Beer.Lager, classUnderTest.getLoad());
    }

    @Test
    public void testGetTemperature(){
        assertEquals(-5, classUnderTest.getTemperature());
    }

    @Test
    public void testMonitorableContainerSetters(){
        this.classUnderTest.setCode("003");
        this.classUnderTest.setTemperature(-4);
        this.classUnderTest.setLoad(Beer.PaleAle);

        assertEquals("003", this.classUnderTest.getCode());
        assertEquals(-4, this.classUnderTest.getTemperature());
        assertEquals(Beer.PaleAle, this.classUnderTest.getLoad());
    }

}
