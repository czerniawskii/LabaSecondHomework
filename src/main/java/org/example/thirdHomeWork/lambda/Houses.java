package org.example.thirdHomeWork.lambda;

public enum Houses {

    FIRST_HOUSE(Zodiac.ARIES, Planet.MARS),
    SECOND_HOUSE(Zodiac.TAURUS, Planet.VENUS),
    THIRD_HOUSE(Zodiac.GEMINI, Planet.MERCURY),
    FOURTH_HOUSE(Zodiac.CANCER, Planet.MOON),
    FIFTH_HOUSE(Zodiac.LEO, Planet.SUN),
    SIXTH_HOUSE(Zodiac.VIRGO, Planet.MERCURY),
    SEVENTH_HOUSE(Zodiac.LIBRA, Planet.VENUS),
    EIGHTH_HOUSE(Zodiac.SCORPIO, Planet.VENUS),
    NINTH_HOUSE(Zodiac.SAGITTARIUS, Planet.JUPITER),
    TENTH_HOUSE(Zodiac.CAPRICORN, Planet.SATURN),
    ELEVENTH_HOUSE(Zodiac.AQUARIUS, Planet.SATURN),
    TWELFTH_HOUSE(Zodiac.PISCES, Planet.JUPITER);

    private final Zodiac zodiacSignInThisHouse;
    private final Planet mostSignificntPlanet;


    Houses(Zodiac zodiacSignInThisHouse, Planet mostSignificntPlanet) {
        this.zodiacSignInThisHouse = zodiacSignInThisHouse;
        this.mostSignificntPlanet = mostSignificntPlanet;
    }

    public Zodiac getZodiacSignInThisHouse() {
        return zodiacSignInThisHouse;
    }

    public Planet getMostSignificntPlanet() {
        return mostSignificntPlanet;
    }

    @Override
    public String toString() {
        return String.format("House: %s, Zodiac Sign: %s, Significant Planet: %s",
                name(), zodiacSignInThisHouse, mostSignificntPlanet);
    }
}
