package com.lifetouch2.Service.Impl;

import com.lifetouch2.Domain.TimeCard;
import com.lifetouch2.Repository.TimeCardRepository;
import com.lifetouch2.Service.TimeCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
@Service
public class TimeCardImpl implements TimeCardService {
    @Autowired
    private TimeCardRepository timeCardRepository;

    @Override
    public TimeCard getOneById(Integer id) {
        return timeCardRepository.findOne(id);
    }

    @Override
    public Iterable<TimeCard> getAll() {
        return timeCardRepository.findAll();
    }

    @Override
    public TimeCard saveOne(TimeCard timeCard) {
        return timeCardRepository.save(timeCard);
    }

    @Override
    public Iterable<TimeCard> saveMany(Iterable<TimeCard> timeCards) {
        return timeCardRepository.save(timeCards);
    }

    @Override
    public boolean deleteById(Integer id) {
        boolean request = false;

        try{
            timeCardRepository.delete(id);
            request = true;
        }catch (Exception e){
            //
        }

        return request;
    }
}
