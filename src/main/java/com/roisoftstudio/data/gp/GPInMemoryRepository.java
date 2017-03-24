package com.roisoftstudio.data.gp;

import com.roisoftstudio.domain.model.GrandPrix;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDate.of;

@Service
public class GPInMemoryRepository implements GPRepository {

    private static List<GrandPrix> gpList = getGrandPrix();

    @Override
    public List<GrandPrix> getByYear(int year) {
        return gpList.stream()
                .filter(gp -> gp.getYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public GrandPrix getById(String id) {
        return gpList.stream()
                .filter(gp -> id.equals(gp.getId()))
                .findFirst().get();
    }


    private static List<GrandPrix> getGrandPrix() {
        List<GrandPrix> grandPrix = new ArrayList<>();
        grandPrix.add(new GrandPrix("2017-01", 2017, "Grand Prix of Qatar - Losail International Circuit", "Qatar", of(2017, 3, 26), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-02", 2017, "Gran Premio Motul de la República Argentina - Termas de Río Hondo", "Argentina", of(2017, 4, 9), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-03", 2017, "Red Bull Grand Prix of The Americas - Circuit Of The Americas", "USA", of(2017, 4, 23), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-04", 2017, "Gran Premio Red Bull de España - Circuito de Jerez", "Spain", of(2017, 5, 7), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-05", 2017, "HJC Helmets Grand Prix de France - Le Mans", "France", of(2017, 5, 21), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-06", 2017, "Gran Premio d'Italia Oakley - Autodromo del Mugello", "Italy", of(2017, 6, 4), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-07", 2017, "Gran Premi Monster Energy de Catalunya - Circuit de Barcelona-Catalunya", "Spain", of(2017, 6, 11), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-08", 2017, "Motul TT Assen - TT Circuit Assen", "Holland", of(2017, 6, 25), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-09", 2017, "GoPro Motorrad Grand Prix Deutschland - Sachsenring", "Germany", of(2017, 7, 2), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-10", 2017, "Monster Energy Grand Prix České republiky - Automotodrom Brno", "Czech Republic", of(2017, 8, 6), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-11", 2017, "NeroGiardini Motorrad Grand Prix von Österreich - Red Bull Ring – Spielberg", "Austria", of(2017, 8, 13), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-12", 2017, "Octo British Grand Prix - Silverstone Circuit", "Great Britain", of(2017, 8, 27), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-13", 2017, "Gran Premio di San Marino e della Riviera di Rimini - Misano World Circuit Marco Simoncelli", "San Marino", of(2017, 9, 10), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-14", 2017, "Gran Premio Movistar de Aragón - MotorLand Aragón", "Spain", of(2017, 9, 24), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-15", 2017, "Motul Grand Prix of Japan - Twin Ring Motegi", "Japan", of(2017, 10, 15), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-16", 2017, "Australian Motorcycle Grand Prix - Phillip Island", "Australia", of(2017, 10, 22), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-17", 2017, "Shell Malaysia Motorcycle Grand Prix - Sepang International Circuit", "Malaysia", of(2017, 10, 29), "tobeplayed"));
        grandPrix.add(new GrandPrix("2017-18", 2017, "Gran Premio Motul de la Comunitat Valenciana - Circuit Ricardo Tormo", "Spain", of(2017, 11, 12), "tobeplayed"));
        return grandPrix;
    }


}
