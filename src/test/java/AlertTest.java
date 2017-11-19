import LoadMonitoringSystem.model.Alert;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ronaldo Regis on 11/19/2017.
 */
public class AlertTest {

    @Test(expected = IllegalArgumentException.class)
    public void containerCodeNullability() throws Exception{
        new Alert(null, 0, 0, 0);
        Assert.fail();
    }
}
