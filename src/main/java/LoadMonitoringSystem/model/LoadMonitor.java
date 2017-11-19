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

        for (MonitorableContainer container : this.containers) {
            if(container.getTemperature() > container.getLoad().getMaxOptimalTemperature() || container.getTemperature() < container.getLoad().getMinOptimalTemperature()){
                alerts.add(new Alert(container.getCode(),container.getTemperature(),container.getLoad().getMaxOptimalTemperature(), container.getLoad().getMinOptimalTemperature()));
            }
        }
        return alerts;
    }

    public void addContainer(MonitorableContainer container){
        this.containers.add(container);
    }
}
