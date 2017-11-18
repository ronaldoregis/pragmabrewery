package model;

import java.util.ArrayList;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class LoadMonitor implements Monitorable {

    private ArrayList<MonitorableContainer> containers;

    public LoadMonitor(){
        this.containers = new ArrayList<MonitorableContainer>();
    }

    public ArrayList<Alert> getAlerts() {
        ArrayList<Alert> alerts = new ArrayList<Alert>();

        for (MonitorableContainer c : this.containers) {
            if(c.getTemperature() > c.getLoad().getMax() || c.getTemperature() < c.getLoad().getMin()){
                alerts.add(new Alert(c.getCode(),c.getTemperature(),c.getLoad().getMax(), c.getLoad().getMin()));
            }
        }
        return alerts;
    }

    public void addContainer(MonitorableContainer container){
        this.containers.add(container);
    }
}
