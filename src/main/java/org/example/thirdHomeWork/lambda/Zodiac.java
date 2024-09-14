package org.example.thirdHomeWork.lambda;

import static org.example.thirdHomeWork.lambda.Planet.*;

public enum Zodiac {

    // ZODIAC_SIGN(PLANET_WHICH_RULES_THIS_SIGN, numberOfzodiac):

    ARIES(MARS, 1),
    TAURUS(VENUS, 2),
    GEMINI(MERCURY, 3),
    CANCER(MOON,4),
    LEO(SUN, 5),
    VIRGO(MERCURY,6),
    LIBRA(VENUS,7),
    SCORPIO(VENUS,8),
    SAGITTARIUS(JUPITER,9),
    CAPRICORN(SATURN,10),
    AQUARIUS(SATURN, 11),
    PISCES(JUPITER, 12);

    private final Planet rulingPlanet;
    private final int numberOfZodiac;

    Zodiac(Planet rulingPlanet, int numberOfZodiac) {
        this.rulingPlanet = rulingPlanet;
        this.numberOfZodiac = numberOfZodiac;    }

    public Planet getRulingPlanet() {
        return rulingPlanet;
    }



    static{
        System.out.println("In Vedic astrology, we do not use Uran, Neptun and Pluton");
    }

}
