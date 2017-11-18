package model;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public interface MonitorableContainer {

    Beer getLoad();
    int getTemperature();
    String getCode();

    void setCode(String code);

    void setLoad(Beer beer);

    void setTemperature(int temperature);
}
