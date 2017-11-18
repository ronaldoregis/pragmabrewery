package model;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public interface Monitorable {

    ArrayList<Alert> getAlerts();

    void addContainer(MonitorableContainer monitorableContainer);
}
