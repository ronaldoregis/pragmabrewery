package LoadMonitoringSystem.model;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class Alert {

    private final String containerCode;
    private final int containerTemperature;
    private final int min;
    private final int max;

    private final static String ILLEGAL_CONTAINER_CODE_ARGUMENT = "Container code must be not null.";

    public Alert(String containerCode, int containerTemperature, int max, int min){
        if(containerCode == null){
            throw new IllegalArgumentException(ILLEGAL_CONTAINER_CODE_ARGUMENT);
        } else {
            this.containerCode = containerCode;
        }
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
