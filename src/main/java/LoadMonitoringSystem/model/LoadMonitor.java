package LoadMonitoringSystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class LoadMonitor implements Monitorable {

    private final ArrayList<MonitorableContainer> containers;

    public LoadMonitor(){
        this.containers = new ArrayList<MonitorableContainer>();
    }

    public List<Alert> getAlerts() {
        ArrayList<Alert> alerts = new ArrayList<Alert>();

        for (MonitorableContainer c : this.containers) {
            if(c.getTemperature() > c.getLoad().getMaxOptimalTemperature() || c.getTemperature() < c.getLoad().getMinOptimalTemperature()){
                alerts.add(new Alert(c.getCode(),c.getTemperature(),c.getLoad().getMaxOptimalTemperature(), c.getLoad().getMinOptimalTemperature()));
            }
        }
        return alerts;
    }

    public void addContainer(MonitorableContainer container){
        this.containers.add(container);
    }
}
