
package com.techreturners.cats;

interface Cat {
    boolean isAsleep();

    void goToSleep();

    void wakeUp();

    String getSetting();

    int getAverageHeight();
}

class DomesticCat implements Cat {
    private boolean isAsleep = false;
    private String settings = "domestic";
    private Integer averageHeight = 23;

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
}

abstract class WildCat implements Cat {
    abstract public int getAverageHeight();

    private String settings = "wild";
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
    private int averageHeight = 1100;

    public int getAverageHeight() {
        return averageHeight;
    }
}
/*class Cheetah extends WildCat {
}*/