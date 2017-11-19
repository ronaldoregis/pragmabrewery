package LoadMonitoringSystem.model;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class BeerContainer implements MonitorableContainer {

    private String code;
    private Beer beer;
    private int temperature;
    private final static String ILLEGAL_CODE_ARGUMENT = "BeerContainer code must be not null.";

    public BeerContainer(String code, Beer beer, int temperature){
        if(code == null){
            throw new IllegalArgumentException(ILLEGAL_CODE_ARGUMENT);
        } else {
            this.code = code;
        }

        if(beer == null){
            this.beer = Beer.EMPTY;
        } else {
            this.beer = beer;
        }

        this.temperature = temperature;
    }

    public Beer getLoad() {
        return this.beer;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code){
        if(code == null){
            throw new IllegalArgumentException(ILLEGAL_CODE_ARGUMENT);
        } else {
            this.code = code;
        }

    }

    public void setLoad(Beer beer){
        if(beer == null){
            this.beer = Beer.EMPTY;
        } else {
            this.beer = beer;
        }
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
