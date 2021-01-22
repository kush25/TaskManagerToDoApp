package com.hcl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.hcl.dao.TaskRepo;

import com.hcl.model.Tasks;

@Service
@Transactional
public class TaskService {

	@Autowired
	public TaskRepo repos;

	public boolean addFeedback(String tskname, String descrip, String email, String sev, Date startdate, Date enddate) {
		try {
			Tasks tks = new Tasks(tskname, descrip, email, sev, startdate, enddate);
			repos.save(tks);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Tasks> listAllTask() {
		return (List<Tasks>) repos.findAll();
	}

	
	 public Tasks get(int id) {
	        return repos.findById(id).get();
	    }
	 
	  public Tasks saveupdate(Tasks tsk) {
	        return repos.save(tsk);
	    }
	  
	  public String deleteTask(Tasks tsk) {
		  repos.delete(tsk);
		  return ("redirect:/listemp");
		  
	  }
	
	}



