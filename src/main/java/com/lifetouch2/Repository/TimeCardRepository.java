package com.lifetouch2.Repository;

import com.lifetouch2.Domain.TimeCard;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Brandon.O'Donnell on 4/26/2017.
 */
public interface TimeCardRepository extends CrudRepository<TimeCard, Integer> {
}
