package com.roisoftstudio.data.calendar;

import com.roisoftstudio.domain.model.calendar.Calendar;
import com.roisoftstudio.domain.model.race.GrandPrix;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.LocalDate.of;

@Service
public class CalendarInMemoryRepository implements CalendarRepository {

    private Map<String, Calendar> calendars;

    public CalendarInMemoryRepository() {
        this.calendars = new HashMap<>();
        calendars.put("2017", new Calendar("MotoGP", "2017", getGrandPrix()));
    }

    private List<GrandPrix> getGrandPrix() {
        List<GrandPrix> grandPrix = new ArrayList<>();
        grandPrix.add(new GrandPrix(1, "Grand Prix of Qatar - Losail International Circuit", "Qatar", of(2017, 3, 26), "tobeplayed"));
        grandPrix.add(new GrandPrix(2, "Gran Premio Motul de la República Argentina - Termas de Río Hondo", "Argentina", of(2017, 4, 9), "tobeplayed"));
        grandPrix.add(new GrandPrix(3, "Red Bull Grand Prix of The Americas - Circuit Of The Americas", "USA", of(2017, 4, 23), "tobeplayed"));
        grandPrix.add(new GrandPrix(4, "Gran Premio Red Bull de España - Circuito de Jerez", "Spain", of(2017, 5, 7), "tobeplayed"));
        grandPrix.add(new GrandPrix(5, "HJC Helmets Grand Prix de France - Le Mans", "France", of(2017, 5, 21), "tobeplayed"));
        grandPrix.add(new GrandPrix(6, "Gran Premio d'Italia Oakley - Autodromo del Mugello", "Italy", of(2017, 6, 4), "tobeplayed"));
        grandPrix.add(new GrandPrix(7, "Gran Premi Monster Energy de Catalunya - Circuit de Barcelona-Catalunya", "Spain", of(2017, 6, 11), "tobeplayed"));
        grandPrix.add(new GrandPrix(8, "Motul TT Assen - TT Circuit Assen", "Holland", of(2017, 6, 25), "tobeplayed"));
        grandPrix.add(new GrandPrix(9, "GoPro Motorrad Grand Prix Deutschland - Sachsenring", "Germany", of(2017, 7, 2), "tobeplayed"));
        grandPrix.add(new GrandPrix(10, "Monster Energy Grand Prix České republiky - Automotodrom Brno", "Czech Republic", of(2017, 8, 6), "tobeplayed"));
        grandPrix.add(new GrandPrix(11, "NeroGiardini Motorrad Grand Prix von Österreich - Red Bull Ring – Spielberg", "Austria", of(2017, 8, 13), "tobeplayed"));
        grandPrix.add(new GrandPrix(12, "Octo British Grand Prix - Silverstone Circuit", "Great Britain", of(2017, 8, 27), "tobeplayed"));
        grandPrix.add(new GrandPrix(13, "Gran Premio di San Marino e della Riviera di Rimini - Misano World Circuit Marco Simoncelli", "San Marino", of(2017, 9, 10), "tobeplayed"));
        grandPrix.add(new GrandPrix(14, "Gran Premio Movistar de Aragón - MotorLand Aragón", "Spain", of(2017, 9, 24), "tobeplayed"));
        grandPrix.add(new GrandPrix(15, "Motul Grand Prix of Japan - Twin Ring Motegi", "Japan", of(2017, 10, 15), "tobeplayed"));
        grandPrix.add(new GrandPrix(16, "Australian Motorcycle Grand Prix - Phillip Island", "Australia", of(2017, 10, 22), "tobeplayed"));
        grandPrix.add(new GrandPrix(17, "Shell Malaysia Motorcycle Grand Prix - Sepang International Circuit", "Malaysia", of(2017, 10, 29), "tobeplayed"));
        grandPrix.add(new GrandPrix(18, "Gran Premio Motul de la Comunitat Valenciana - Circuit Ricardo Tormo", "Spain", of(2017, 11, 12), "tobeplayed"));
        return grandPrix;
    }

    @Override
    public void addCalendar(String year, Calendar calendar) {
        calendars.put(year, calendar);
    }

    @Override
    public Calendar getCalendar(String year) {
        return calendars.get(year);
    }
}
