package com.roisoftstudio.data.rider;

import com.roisoftstudio.domain.model.rider.Rider;

public class RidersMotoGP {
    public static final String YAMAHA = "Yamaha";
    public static final String HONDA = "Honda";

    public static final String MOVISTAR_YAMAHA_MOTO_GP = "Movistar Yamaha MotoGP";
    public static final String REPSOL_HONDA_TEAM = "Repsol Honda Team";

    public static final String ITA = "ITA";
    public static final String FRA = "FRA";
    public static final String SPA = "SPA";
    public static final String CZE = "CZE";

    public static Rider ANDREA_DOVIZIOSO = new Rider(4, "Andrea Dovizioso", ITA, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider JOHAN_ZARCO = new Rider(5, "Johan Zarco", FRA, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider HECTOR_BARBERA = new Rider(8, "Hector Barbera", SPA, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider DANILO_PETRUCCI = new Rider(9, "Danilo Petrucci", ITA, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider KAREL_ABRAHAM = new Rider(17, "Karel Abraham", CZE, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider ALVARO_BAUTISTA = new Rider(19, "Alvaro Bautista", SPA, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider MAVERIK_VINALES = new Rider(25, "Maverick Viñales", SPA, MOVISTAR_YAMAHA_MOTO_GP, YAMAHA);
    public static Rider DANI_PEDROSA = new Rider(26, "Dani Pedrosa", SPA, REPSOL_HONDA_TEAM, HONDA);
    public static Rider MARK_MARQUEZ = new Rider(93, "Marc Marquez", SPA, REPSOL_HONDA_TEAM, HONDA);
}
