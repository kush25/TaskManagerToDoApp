package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Useradd;


@Repository
public interface UseraddDAO extends CrudRepository<Useradd, String> {

}
