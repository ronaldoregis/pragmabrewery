package LoadMonitoringSystem.model;

import java.util.List;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public interface Monitorable {

    List<Alert> getAlerts();

    void addContainer(MonitorableContainer monitorableContainer);
    void setContainerTemperature(String containerCode, int temperature);
    MonitorableContainer getContainer(String containerCode);
}
