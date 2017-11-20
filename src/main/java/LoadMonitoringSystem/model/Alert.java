package LoadMonitoringSystem.model;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class Alert {

    private final String containerCode;
    private final int containerTemperature;
    private final int min;
    private final int max;

    public Alert(String containerCode, int containerTemperature, int max, int min){

        this.containerCode = containerCode;
        this.containerTemperature = containerTemperature;
        this.max = max;
        this.min = min;
    }

    @Override
    public String toString(){
        return "{'containerCode':'"+ this.containerCode +"'," +
                "'currentTemperature':'"+ this.containerTemperature +"'," +
                "'optimalTemperatureRange':'"+ this.min +" to "+ this.max +"'}";
    }


}
