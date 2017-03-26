package com.roisoftstudio.data.userresult;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.roisoftstudio.data.event.EventInMemoryRepository.getResults;
import static com.roisoftstudio.domain.model.event.Category.*;
import static java.util.Arrays.asList;

@Service
public class SelectionInMemoryRepository implements SelectionRepository {

    private static Map<String, List<Selection>> selectionList = getSelections();

    @Override
    public Selection getByGPIdAndCategory(String userId, Category category) {
        return selectionList.get(userId).stream()
                .filter(event -> category.equals(event.getCategory()))
                .findFirst().get();
    }

    private static Map<String, List<Selection>> getSelections() {
        Map<String, List<Selection>> selectionsByUserId = new HashMap<>();
        selectionsByUserId.put("userId1", asList(
                new Selection(MOTOGP, getResults()),
                new Selection(MOTO2, getResults()),
                new Selection(MOTO3, getResults())));
        selectionsByUserId.put("userId2", asList(
                new Selection(MOTOGP, getResults()),
                new Selection(MOTO2, getResults()),
                new Selection(MOTO3, getResults())));
        return selectionsByUserId;
    }


}
