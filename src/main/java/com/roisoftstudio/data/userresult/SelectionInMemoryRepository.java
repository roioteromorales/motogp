package com.roisoftstudio.data.userresult;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.event.LapResult;
import com.roisoftstudio.domain.model.selection.Selection;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.roisoftstudio.data.rider.RidersMotoGP.*;
import static com.roisoftstudio.domain.model.event.Category.*;
import static java.util.Collections.emptyMap;

@Service
public class SelectionInMemoryRepository implements SelectionRepository {

    private static Map<String, Map<Category, Selection>> selectionList = getSelections();

    @Override
    public Selection getByUserIdAndCategory(String userId, Category category) {
        Map<Category, Selection> selections = selectionList.getOrDefault(userId, emptyMap());
        return selections.get(category);
    }

    @Override
    public Selection saveByUserIdAndCategory(String userId, Category category, Selection selection) {
        Map<Category, Selection> selections = selectionList.getOrDefault(userId, emptyMap());
        selections.put(category, selection);
        return selection;
    }

    private static Map<String, Map<Category, Selection>> getSelections() {
        Map<String, Map<Category, Selection>> selectionsByUserId = new HashMap<>();
        selectionsByUserId.put("1", getCategorySelectionMap());
        selectionsByUserId.put("2", getCategorySelectionMap());
        return selectionsByUserId;
    }

    private static HashMap<Category, Selection> getCategorySelectionMap() {
        HashMap<Category, Selection> map = new HashMap<>();
        map.put(MOTOGP, new Selection(MAVERIK_VINALES, ANDREA_DOVIZIOSO, DANILO_PETRUCCI, getFastestLap()));
        map.put(MOTO2, new Selection(HECTOR_BARBERA, DANILO_PETRUCCI, ANDREA_DOVIZIOSO, getFastestLap()));
        map.put(MOTO3, new Selection(ALVARO_BAUTISTA, KAREL_ABRAHAM, DANILO_PETRUCCI, getFastestLap()));
        return map;
    }

    private static LapResult getFastestLap() {
        return new LapResult(2, MAVERIK_VINALES, "1:56.231", "168 km/h");
    }


}
