package com.hcl.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.UseraddDAO;
import com.hcl.model.Useradd;


@Service
public class UserService {

	public static Useradd LogIn = null;
	
	@Autowired
	UseraddDAO userdao;
	
	

	public boolean addUser(String uname, String upass,String uemail) {
		
		Useradd usr= new Useradd(uname,upass,uemail);
		userdao.save(usr);
		return true;
	}
	

	public Useradd login(Useradd u) {

		List<Useradd> userlist = (List<Useradd>) userdao.findAll();

		Useradd match = userlist.stream()
				.filter(x -> x.getUname().equals(u.getUname()) && x.getUpass().equals(u.getUpass()))
				.findFirst().get();

		if (match != null) {
			LogIn = u;
			return match;
		} else {
			return null;
		}
	}
	
	
}
