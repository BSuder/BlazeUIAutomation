package Helpers;

import java.util.Random;

public enum DepartureCities {

    PARIS("Paris"),
    PHILADELPHIA("Philadelphia"),
    BOSTON("Boston"),
    PORTLAND("Portland"),
    CAN_DIEGO("San Diego"),
    MEXICO_CITY("Mexico City"),
    SAO_PAOLO("São Paolo");

    DepartureCities(String city) {}

    public String getRandomCity() {
        int pick = new Random().nextInt(DepartureCities.values().length);
        return DepartureCities.values()[pick].toString();
    }
}
