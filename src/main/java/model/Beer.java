package model;

import java.util.Map;

/**
 * Created by Ronaldo Regis on 11/18/2017.
 */
public enum Beer {
    Pilsner( -4, -6),
    IPA(-5, -6),
    Lager(-4, -7),
    Stout(-6, -8),
    WheatBeer(-3, -5),
    PaleAle(-4, -6);

    private final int max, min;

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
