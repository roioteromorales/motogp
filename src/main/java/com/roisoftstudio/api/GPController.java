package com.roisoftstudio.api;

import com.roisoftstudio.domain.model.GrandPrix;
import com.roisoftstudio.domain.service.GPService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@CrossOrigin
@RestController
public class GPController {

    @Inject
    private GPService gpService;

    @RequestMapping("/gp/{id}")
    public GrandPrix getGrandPrixById(@PathVariable String id) {
        return gpService.get(id);
    }


    @RequestMapping("/gps/{year}")
    public List<GrandPrix> listGrandPrixByYear(@PathVariable int year) {
        return gpService.get(year);
    }

}
