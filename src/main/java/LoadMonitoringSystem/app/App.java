package LoadMonitoringSystem.app;

import LoadMonitoringSystem.model.*;

import java.util.List;

/**
 * Created by Ronaldo Regis on 11/19/2017.
 */
public class App {

    public static void main(String args[]){

        Monitorable monitor = new LoadMonitor();
        loadInitialContainers(monitor);

        List<Alert> alerts = monitor.getAlerts();

        //print with only one entry ([{"containerCode":"004","containerTemperature":-5,"min":-8,"max":-6}])
        System.out.println(alerts.toString());


        //add more containers
        loadHighTemperatureContainers(monitor);
        alerts = monitor.getAlerts();
        //print after add containers with high temperature
        System.out.println(alerts.toString());

    }

    private static void loadInitialContainers(Monitorable monitor){
        MonitorableContainer container;

        container = new BeerContainer("000",Beer.EMPTY, 0 );
        monitor.addContainer(container);

        container = new BeerContainer("001", Beer.PILSNER, -5);
        monitor.addContainer(container);

        container = new BeerContainer("002", Beer.IPA, -5);
        monitor.addContainer(container);

        container = new BeerContainer("003", Beer.LAGER, -5);
        monitor.addContainer(container);

        container = new BeerContainer("004", Beer.STOUT, -5);
        monitor.addContainer(container);

        container = new BeerContainer("005", Beer.WHEAT_BEER, -5);
        monitor.addContainer(container);

        container = new BeerContainer("006", Beer.PALE_ALE, -5);
        monitor.addContainer(container);
    }

    private static void loadHighTemperatureContainers(Monitorable monitor){
        MonitorableContainer container;

        container = new BeerContainer("007",Beer.PALE_ALE, 10 );
        monitor.addContainer(container);

        container = new BeerContainer("008",Beer.PALE_ALE, 10 );
        monitor.addContainer(container);

        container = new BeerContainer("009",Beer.PALE_ALE, 10 );
        monitor.addContainer(container);

        container = new BeerContainer("010",Beer.PALE_ALE, 10 );
        monitor.addContainer(container);
    }
}
