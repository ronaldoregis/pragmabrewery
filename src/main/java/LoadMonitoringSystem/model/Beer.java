package LoadMonitoringSystem.model;

public enum Beer {
    PILSNER( -4, -6),
    IPA(-5, -6),
    LAGER(-4, -7),
    STOUT(-6, -8),
    WHEATBEER(-3, -5),
    PALEALE(-4, -6),
    EMPTY(Integer.MAX_VALUE, Integer.MIN_VALUE);

    /**
     * Created by Ronaldo Regis on 11/18/2017.
     */
    private final int maxOptimalTemperature;
    private final int minOptimalTemperature;

    Beer(int maxOptimalTemperature, int minOptimalTemperature){
        this.maxOptimalTemperature = maxOptimalTemperature;
        this.minOptimalTemperature = minOptimalTemperature;
    }

    public int getMaxOptimalTemperature(){
        return this.maxOptimalTemperature;
    }

    public int getMinOptimalTemperature(){
        return this.minOptimalTemperature;
    }
}
