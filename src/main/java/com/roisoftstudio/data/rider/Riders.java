package com.roisoftstudio.data.rider;

import com.roisoftstudio.domain.model.rider.Rider;

public class Riders {
    public static final String YAMAHA = "Yamaha";
    public static final String HONDA = "Honda";

    public static final String MOVISTAR_YAMAHA_MOTO_GP = "Movistar Yamaha MotoGP";
    public static final String REPSOL_HONDA_TEAM = "Repsol Honda Team";

    public static Rider MAVERIK_VINALES = new Rider(25, "Maverick VIÑALES", "SPA", MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider MARK_MARQUEZ = new Rider(93, "Marc MARQUEZ", "SPA", REPSOL_HONDA_TEAM, HONDA);
    public static Rider DANI_PEDROSA = new Rider(26, "Dani PEDROSA", "SPA", REPSOL_HONDA_TEAM, HONDA);
}
