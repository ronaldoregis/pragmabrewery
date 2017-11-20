package LoadMonitoringSystem.model;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class BeerContainer implements MonitorableContainer {

    private String code;
    private Beer load;
    private int temperature;
    private final static String ILLEGAL_CODE_ARGUMENT = "BeerContainer code must be not null.";
    private final static String NOT_COMPARABLE = "Can not compare with null.";

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

    @Override
    public boolean equals(Object object){

        if(object == null){
            return false;
        }

        BeerContainer beerContainerObject = (BeerContainer) object;
        if(this.code == beerContainerObject.getCode()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return this.code.hashCode();
    }
}
