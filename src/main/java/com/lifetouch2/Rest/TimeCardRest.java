package com.lifetouch2.Rest;

import com.lifetouch2.Domain.TimeCard;
import com.lifetouch2.Service.TimeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@RestController
@RequestMapping("/api/timeCard")
public class TimeCardRest {
    @Autowired
    private TimeCardService timeCardService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    private TimeCard getById(@PathVariable Integer id) {
        return timeCardService.getOneById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private Iterable<TimeCard> getAll() {
        return timeCardService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    private TimeCard saveOne(@RequestBody TimeCard timeCard) {
        return timeCardService.saveOne(timeCard);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    private Iterable<TimeCard> saveMulti(@RequestBody Iterable<TimeCard> timeCards) {
        return timeCardService.saveMany(timeCards);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    private boolean deleteOne(@PathVariable Integer id) {
        return timeCardService.deleteById(id);
    }

}
