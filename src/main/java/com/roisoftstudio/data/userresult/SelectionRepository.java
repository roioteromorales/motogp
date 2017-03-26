package com.roisoftstudio.data.userresult;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;

public interface SelectionRepository {
    Selection getByGPIdAndCategory(String userId, Category category);

}
