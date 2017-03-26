package com.roisoftstudio.api;

import com.roisoftstudio.domain.model.event.Category;
import com.roisoftstudio.domain.model.event.Event;
import com.roisoftstudio.domain.model.event.EventType;
import com.roisoftstudio.domain.service.EventService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@CrossOrigin
@RestController
@RequestMapping("/gp/{gpId}/category/{category}")
public class EventController {

    @Inject
    private EventService eventService;

    @RequestMapping(value = "/", method = GET)
    public List<Event> getEvent(@PathVariable String gpId, @PathVariable Category category) {
        return eventService.getEvent(gpId, category);
    }

    @RequestMapping(value = "/event/{eventType}", method = GET)
    public Event getEvent(@PathVariable String gpId, @PathVariable Category category, @PathVariable EventType eventType) {
        return eventService.getEvent(gpId, category, eventType);
    }
}
