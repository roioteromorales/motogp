package com.roisoftstudio.api;

import com.roisoftstudio.domain.model.RaceResult;
import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.service.RaceResultsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
@RequestMapping("/results")
public class RaceResultsController {

    @Inject
    private RaceResultsService raceResultsService;

    @RequestMapping(value = "/current/{category}", method = GET)
    public List<RaceResult> getCurrent(@PathVariable Category category) {
        return raceResultsService.getCurrent(category);
    }

}