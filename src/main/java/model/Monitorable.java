package model;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public interface Monitorable {

    @NotNull
    List<Alert> getAlerts();

    void addContainer(MonitorableContainer monitorableContainer);
}
