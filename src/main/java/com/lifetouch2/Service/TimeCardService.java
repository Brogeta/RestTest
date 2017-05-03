package com.lifetouch2.Service;

import com.lifetouch2.Domain.TimeCard;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
public interface TimeCardService {

    TimeCard getOneById(Integer id);

    Iterable<TimeCard> getAll();

    TimeCard saveOne(TimeCard timeCard);

    Iterable<TimeCard> saveMany(Iterable<TimeCard> timeCards);

    boolean deleteById(Integer id);
}
