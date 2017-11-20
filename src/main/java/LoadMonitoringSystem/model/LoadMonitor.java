package LoadMonitoringSystem.model;

import java.util.*;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class LoadMonitor implements Monitorable {

    private final Set<MonitorableContainer> containers;

    private final static String ILLEGAL_ARGUMENT = "Null parameter not allowed.";

    public LoadMonitor(){
        this.containers = new HashSet<MonitorableContainer>();
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
        if(container == null){
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT);
        }
        this.containers.add(container);
    }

    public void setContainerTemperature(String code, int newTemperature){
        if(code != null){
            MonitorableContainer container = getContainer(code);
            container.setTemperature(newTemperature);
            this.containers.add(container);
        }
    }

    public MonitorableContainer getContainer(String containerCode){
        if(containerCode == null){
            return null;
        }
        for (MonitorableContainer it : this.containers) {
            if (it.hashCode() == containerCode.hashCode()) {
                return it;
            }
        }
        return null;
    }
}
