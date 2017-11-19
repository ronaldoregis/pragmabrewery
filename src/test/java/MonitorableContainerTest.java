import LoadMonitoringSystem.model.Beer;
import LoadMonitoringSystem.model.BeerContainer;
import LoadMonitoringSystem.model.MonitorableContainer;
import org.junit.Assert;
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
        this.classUnderTest = new BeerContainer("001", Beer.LAGER, -5);
    }


    @Test
    public void testGetCode(){
        assertEquals("001", classUnderTest.getCode());
    }

    @Test
    public void testGetLoad(){
        assertEquals(Beer.LAGER, classUnderTest.getLoad());
    }

    @Test
    public void testGetTemperature(){
        assertEquals(-5, classUnderTest.getTemperature());
    }

    @Test
    public void testMonitorableContainerSetters(){
        this.classUnderTest.setCode("003");
        this.classUnderTest.setTemperature(-4);
        this.classUnderTest.setLoad(Beer.PALE_ALE);

        assertEquals("003", this.classUnderTest.getCode());
        assertEquals(-4, this.classUnderTest.getTemperature());
        assertEquals(Beer.PALE_ALE, this.classUnderTest.getLoad());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCodeNullability() throws Exception{
        new BeerContainer(null, Beer.PILSNER, -1);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCodeNullability() throws Exception{
        this.classUnderTest.setCode(null);
        Assert.fail();
    }

    @Test
    public void testBeerNullability(){
        MonitorableContainer container = new BeerContainer("001", null, -1);
        assertEquals(Integer.MAX_VALUE, container.getLoad().getMaxOptimalTemperature());

        container.setLoad(null);
        assertEquals(Integer.MAX_VALUE, container.getLoad().getMaxOptimalTemperature());
    }

}
