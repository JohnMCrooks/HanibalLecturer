/*
 * Copyright (c) 2016.
 */

package com.crooks.services;

import com.crooks.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by johncrooks on 6/30/16.
 */
public interface LecturerRepository extends CrudRepository<Lecturer, Integer> {
}
