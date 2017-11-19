package LoadMonitoringSystem.model;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class BeerContainer implements MonitorableContainer {

    private String code;
    private Beer load;
    private int temperature;
    private final static String ILLEGAL_CODE_ARGUMENT = "BeerContainer code must be not null.";

    public BeerContainer(String code, Beer load, int temperature){
        if(code == null){
            throw new IllegalArgumentException(ILLEGAL_CODE_ARGUMENT);
        }
        this.code = code;

        if(load == null){
            this.load = Beer.EMPTY;
        } else {
            this.load = load;
        }

        this.temperature = temperature;
    }

    public Beer getLoad() {
        return this.load;
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
        }
        this.code = code;
    }

    public void setLoad(Beer load){
        if(load == null){
            this.load = Beer.EMPTY;
        } else {
            this.load = load;
        }
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
