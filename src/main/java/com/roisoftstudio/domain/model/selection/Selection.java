package com.roisoftstudio.domain.model.selection;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.event.Results;

public class Selection {
    private Category category;
    private Results results;

    public Selection(Category category, Results results) {
        this.category = category;
        this.results = results;
    }

    public Category getCategory() {
        return category;
    }

    public Results getResults() {
        return results;
    }

    public static Selection empty() {
        return new Selection(null, null);
    }
}
