package com.roisoftstudio.api;

import com.roisoftstudio.data.event.Category;
import com.roisoftstudio.data.event.EventType;
import com.roisoftstudio.domain.model.event.Event;
import com.roisoftstudio.domain.service.EventService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@CrossOrigin
@RestController
public class EventController {

    @Inject
    private EventService eventService;

    @RequestMapping("/gp/{gpId}/category/{category}/event/{eventType}")
    public Event getEvent(@PathVariable String gpId, @PathVariable Category category, @PathVariable EventType eventType) {
        return eventService.getEvent(gpId, category, eventType);
    }


}