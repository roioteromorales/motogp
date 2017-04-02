package com.roisoftstudio.data.userresult;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.event.LapResult;
import com.roisoftstudio.domain.model.selection.Selection;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.roisoftstudio.data.rider.RidersMotoGP.*;
import static com.roisoftstudio.domain.model.event.Category.*;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

@Service
public class SelectionInMemoryRepository implements SelectionRepository {

    private static Map<String, List<Selection>> selectionList = getSelections();

    @Override
    public Selection getByGPIdAndCategory(String userId, Category category) {
        List<Selection> selections = selectionList.getOrDefault(userId, emptyList());
        return selections.stream()
                .filter(selection -> category.equals(selection.getCategory()))
                .findFirst().orElse(Selection.empty());
    }

    private static Map<String, List<Selection>> getSelections() {
        Map<String, List<Selection>> selectionsByUserId = new HashMap<>();
        selectionsByUserId.put("1", asList(
                new Selection(MOTOGP, MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap()),
                new Selection(MOTO2, MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap()),
                new Selection(MOTO3, MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap())));
        selectionsByUserId.put("2", asList(
                new Selection(MOTOGP, MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap()),
                new Selection(MOTO2, MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap()),
                new Selection(MOTO3, MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap())));
        return selectionsByUserId;
    }

    private static LapResult getFastestLap() {
        return new LapResult(2, MAVERIK_VINALES, "1:56.231", "168 km/h");
    }


}
