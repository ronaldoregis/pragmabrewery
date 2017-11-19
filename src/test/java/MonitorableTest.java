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
        MonitorableContainer monitorableContainer = new BeerContainer("002", Beer.WHEATBEER, -2);

        this.classUnderTest = new LoadMonitor();
        this.classUnderTest.addContainer(monitorableContainer);

    }

    @Test
    public void testGetAlerts(){
        assertEquals(1, this.classUnderTest.getAlerts().size());
        String expected = "{'containerCode':'002'," +
                "'currentTemperature':'-2'," +
                "'optimalTemperatureRange':'"+ Beer.WHEATBEER.getMinOptimalTemperature() +" to "+ Beer.WHEATBEER.getMaxOptimalTemperature() +"'}";

        assertEquals(expected, this.classUnderTest.getAlerts().get(0).toString());
    }
}
