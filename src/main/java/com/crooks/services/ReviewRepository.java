/*
 * Copyright (c) 2016.
 */

package com.crooks.services;

import com.crooks.entities.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;

/**
 * Created by johncrooks on 6/30/16.
 */
public interface ReviewRepository  extends CrudRepository<Review, Integer>{
        public Iterable<Review> findByLecturerId(Integer lecturerId);
}
