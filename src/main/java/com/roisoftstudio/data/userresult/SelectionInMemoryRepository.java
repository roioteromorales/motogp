package com.roisoftstudio.data.userresult;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.roisoftstudio.data.event.EventInMemoryRepository.getResults;
import static com.roisoftstudio.domain.model.event.Category.*;
import static com.roisoftstudio.domain.model.selection.Selection.empty;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

@Service
public class SelectionInMemoryRepository implements SelectionRepository {

    private static Map<String, List<Selection>> selectionList = getSelections();

    @Override
    public Selection getByGPIdAndCategory(String userId, Category category) {
        List<Selection> selections = selectionList.getOrDefault(userId, emptyList());
        return selections.stream()
                .filter(event -> category.equals(event.getCategory()))
                .findFirst().orElse(empty());
    }

    private static Map<String, List<Selection>> getSelections() {
        Map<String, List<Selection>> selectionsByUserId = new HashMap<>();
        selectionsByUserId.put("1", asList(
                new Selection(MOTOGP, getResults()),
                new Selection(MOTO2, getResults()),
                new Selection(MOTO3, getResults())));
        selectionsByUserId.put("2", asList(
                new Selection(MOTOGP, getResults()),
                new Selection(MOTO2, getResults()),
                new Selection(MOTO3, getResults())));
        return selectionsByUserId;
    }


}
