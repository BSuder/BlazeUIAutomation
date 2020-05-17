package Helpers.enums;

import java.util.Random;

public enum DestinationCities {

    BUENOS_AIRES("Buenos Aires"),
    ROME("Rome"),
    LONDON("London"),
    BERLIN("Berlin"),
    NEW_YORK("New York"),
    DUBLIN("Dublin Cairo");

    DestinationCities(String city) {}

    public static String getRandomCity() {
        int pick = new Random().nextInt(DestinationCities.values().length);
        return DestinationCities.values()[pick].toString();
    }
}
