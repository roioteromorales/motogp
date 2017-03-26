package com.roisoftstudio.api.selection;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;
import com.roisoftstudio.domain.service.SelectionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
@RequestMapping("/selection/{userId}/category/{category}")
public class SelectionController {

    @Inject
    private SelectionService selectionService;

    @RequestMapping(value = "/", method = GET)
    public Selection getSelection(@PathVariable String userId, @PathVariable Category category) {
        return selectionService.getSelection(userId, category);
    }

//    @RequestMapping(value = "/", method = POST)
//    public Selection postSelection(@PathVariable String userId, @PathVariable Category category) {
//        return selectionService.getSelection(userId, category);
//    }
}
