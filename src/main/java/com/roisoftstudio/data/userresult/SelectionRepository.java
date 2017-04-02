package com.roisoftstudio.data.userresult;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;

public interface SelectionRepository {
    Selection getByUserIdAndCategory(String userId, Category category);

    Selection saveByUserIdAndCategory(String userId, Category category, Selection selection);
}
