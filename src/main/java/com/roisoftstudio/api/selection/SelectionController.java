package com.roisoftstudio.api.selection;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.selection.Selection;
import com.roisoftstudio.domain.service.SelectionService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
@RequestMapping("/selection/category/{category}")
public class SelectionController {

    @Inject
    private SelectionService selectionService;

    @RequestMapping(value = "/", method = GET)
    public Selection getSelection(@PathVariable Category category, @RequestHeader("X-Authorization") String userId) {
        return selectionService.getSelection(userId, category);
    }

//    @RequestMapping(value = "/", method = POST)
//    public Selection postSelection(@PathVariable String userId, @PathVariable Category category) {
//        return selectionService.getSelection(userId, category);
//    }
}
