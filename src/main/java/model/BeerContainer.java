package model;

import java.util.Map;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public class BeerContainer implements MonitorableContainer {

    private String code;
    private Beer beer;
    private int temperature;

    public BeerContainer(String code, Beer beer, int temperature){
        this.code = code;
        this.beer = beer;
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
        this.code = code;
    }

    public void setLoad(Beer beer){
        this.beer = beer;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
