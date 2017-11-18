import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class MonitorableTest {

    private Monitorable classUnderTest;

    @Before
    public void setUp(){
        MonitorableContainer monitorableContainer = new BeerContainer("002", Beer.WheatBeer, -2);

        this.classUnderTest = new LoadMonitor();
        this.classUnderTest.addContainer(monitorableContainer);

    }

    @Test
    public void testGetAlerts(){
        assertEquals(1, this.classUnderTest.getAlerts().size());
        String expected = "{'containerCode':'002'," +
                "'currentTemperature':'-2'," +
                "'optimalTemperatureRange':'"+ Beer.WheatBeer.getMin() +" to "+ Beer.WheatBeer.getMax() +"'}";

        assertEquals(expected, this.classUnderTest.getAlerts().get(0).toString());
    }
}
