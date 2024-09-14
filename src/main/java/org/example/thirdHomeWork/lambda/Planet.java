package org.example.thirdHomeWork.lambda;

public enum Planet {

    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(684),
    JUPITER(4333),
    SATURN(10756),
    URAN(30687),
    NEPTUN(60190),
    PLUTON(90560),
    MOON(28),
    SUN(0);


    private final int TURN_AROUND_SUN; //in days

    Planet(int turnAroundSun) {
        TURN_AROUND_SUN = turnAroundSun;
    }

    public double daysToYears(){
        return TURN_AROUND_SUN / 365;
    }

        static {
            System.out.println("Here we treat Pluton as a planet. For astrology reasons, we treat Moon and Sun as a planets too");
        }
}
