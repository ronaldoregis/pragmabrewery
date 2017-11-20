import LoadMonitoringSystem.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class MonitorableTest {

    private Monitorable classUnderTest;

    @Before
    public void setUp(){
        MonitorableContainer monitorableContainer = new BeerContainer("002", Beer.WHEAT_BEER, -2);

        this.classUnderTest = new LoadMonitor();
        this.classUnderTest.addContainer(monitorableContainer);

    }

    @Test
    public void testGetAlerts(){
        assertEquals(1, this.classUnderTest.getAlerts().size());
        String expected = "{'containerCode':'002'," +
                "'currentTemperature':'-2'," +
                "'optimalTemperatureRange':'"+ Beer.WHEAT_BEER.getMinOptimalTemperature() +" to "+ Beer.WHEAT_BEER.getMaxOptimalTemperature() +"'}";

        assertEquals(expected, this.classUnderTest.getAlerts().get(0).toString());
    }

    @Test
    public void testSetContainertemperature(){
        this.classUnderTest.setContainerTemperature("002", 10);
        assertEquals(10,this.classUnderTest.getContainer("002").getTemperature());
        this.classUnderTest.setContainerTemperature("002", 15);
        assertEquals(15,this.classUnderTest.getContainer("002").getTemperature());
    }

    @Test
    public void testGetContainerWithNullParameter(){
        assertEquals(null,this.classUnderTest.getContainer(null));
    }

    @Test
    public void testGetUnknownContainer(){
        assertEquals(null, this.classUnderTest.getContainer("UnknownContainer"));
    }
}
