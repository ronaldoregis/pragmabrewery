package model;

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
    private final int max;
    private final int min;

    Beer(int max, int min){
        this.max = max;
        this.min = min;
    }

    public int getMax(){
        return this.max;
    }

    public int getMin(){
        return this.min;
    }
}
