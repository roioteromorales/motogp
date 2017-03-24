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

    @RequestMapping("/gp/{year}/{id}")
    public GrandPrix grandPrix(@PathVariable int year, @PathVariable int id) {
        return gpService.get(year, id);
    }


    @RequestMapping("/gp/{year}")
    public List<GrandPrix> grandPrixByYear(@PathVariable int year) {
        return gpService.get(year);
    }

}
