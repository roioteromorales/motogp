package com.roisoftstudio.data.raceresult;

import com.roisoftstudio.domain.model.RaceResult;
import com.roisoftstudio.domain.model.event.Category;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.roisoftstudio.data.rider.RidersMotoGP.*;
import static java.util.Arrays.asList;

@Service
public class RaceResultsInMemoryRepository implements RaceResultsRepository {
    private static Map<Category, List<RaceResult>> raceResultList = createRaceResults();

    @Override
    public List<RaceResult> getCurrent(Category category) {
        return raceResultList.get(category);
    }

    private static Map<Category, List<RaceResult>> createRaceResults() {
        Map<Category, List<RaceResult>> map = new HashMap<>();
        map.put(Category.MOTOGP, asList(
                new RaceResult(1, MAVERIK_VINALES.getName(), "1:45:536"),
                new RaceResult(2, DANI_PEDROSA.getName(), "1:45:456"),
                new RaceResult(3, MARK_MARQUEZ.getName(), "1:45:681"),
                new RaceResult(4, ALVARO_BAUTISTA.getName(), "1:44:724"),
                new RaceResult(5, KAREL_ABRAHAM.getName(), "1:45:768"),
                new RaceResult(6, ANDREA_DOVIZIOSO.getName(), "1:45:521")
        ));
        return map;
    }
}
