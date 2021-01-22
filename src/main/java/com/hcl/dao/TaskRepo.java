package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Tasks;


@Repository
public interface TaskRepo extends CrudRepository<Tasks, Integer> {

}

