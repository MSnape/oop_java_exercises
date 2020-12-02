
package com.techreturners.cats;

import java.util.Random;

interface Cat {
    boolean isAsleep();

    void goToSleep();

    void wakeUp();

    String getSetting();

    int getAverageHeight();

    String eat();

}

class DomesticCat implements Cat {
    private boolean isAsleep = false;
    final String settings = "domestic";
    final Integer averageHeight = 23;

    public boolean isAsleep() {
        return isAsleep;
    }

    public void goToSleep() {
        isAsleep = true;
    }

    public void wakeUp() {
        isAsleep = false;
    }

    public String getSetting() {
        return settings;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    //this will randomly cause the
    public String eat() {
        Random rand = new Random();
        if (rand.nextInt(50) % 2 == 0)
            return "It will do I suppose";
        else
            return "Purrrrrrr";
    }
}

abstract class WildCat implements Cat {
    abstract public int getAverageHeight();

    final String settings = "wild";
    private boolean isAsleep = false;

    public String getSetting() {
        return settings;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public void goToSleep() {
        isAsleep = true;
    }

    public void wakeUp() {
        isAsleep = false;
    }
}

class LionCat extends WildCat {
    final int averageHeight = 1100;

    public int getAverageHeight() {
        return averageHeight;
    }

    public String eat() {
        return "Roar!!!!";
    }
}

class CheetahCat extends WildCat {
    public String eat() {
        return "Zzzzzzz";
    }

    public int getAverageHeight() {
        //throw new Exception("Not implemented for CheetahCat.");
        return 0;
    }
}