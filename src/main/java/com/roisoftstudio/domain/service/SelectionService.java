package com.roisoftstudio.domain.service;

import com.roisoftstudio.data.userresult.SelectionRepository;
import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class SelectionService {

    private SelectionRepository selectionRepository;

    @Inject
    public SelectionService(SelectionRepository selectionRepository) {
        this.selectionRepository = selectionRepository;
    }


    public Selection getSelection(String userId, Category category) {
        return selectionRepository.getByUserIdAndCategory(userId, category);
    }

    public Selection saveSelection(String userId, Category category, Selection selection) {
        return selectionRepository.saveByUserIdAndCategory(userId, category, selection);
    }

}
