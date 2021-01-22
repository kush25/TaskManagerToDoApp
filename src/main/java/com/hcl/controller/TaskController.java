package com.hcl.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.hcl.model.Tasks;

import com.hcl.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	public TaskService fbservice;
	


	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}

	@GetMapping("/addfeeds")
	public ModelAndView taskadding() {
		Tasks f1 = new Tasks();
		return new ModelAndView("main", "form", f1);
	}

	@PostMapping("/addfeeds")
	public ModelAndView taskadd(@RequestParam("tskname") String tskname, @RequestParam("descrip") String descrip,
			@RequestParam("email") String email, @RequestParam("sev") String sev,
			@RequestParam("startdate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date startdate,
			@RequestParam("enddate") @DateTimeFormat(pattern = "yyyy-mm-dd") Date enddate) {

		fbservice.addFeedback(tskname, descrip, email, sev, startdate, enddate);

		return new ModelAndView("redirect:/loadfeeds");

	}

	@GetMapping("/loadfeeds")
	public ModelAndView listtask() {
		List<Tasks> fds = fbservice.listAllTask();
		return new ModelAndView("listfeeds", "fd", fds);
	}


	@GetMapping("/edit/{id}")
	public ModelAndView edittask(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("updatestask");
		 Tasks tsk = fbservice.get(id);
		mav.addObject("updtsk", tsk);
		return mav;
	}
	
	
	
	 @PostMapping("/edit/{id}")
     public ModelAndView editsaveEmp(@ModelAttribute("tsk") Tasks tsk) {
         
        fbservice.saveupdate(tsk);
        return new ModelAndView("redirect:/loadfeeds");
        }
	 
	 
	 @GetMapping("/del/{id}")
		public ModelAndView delEmp(@PathVariable("id") int id) {
			ModelAndView mav = new ModelAndView("deletetask");
			 Tasks tsk1 = fbservice.get(id);
			mav.addObject("deltsk", tsk1);
			return mav;
		}
		
	 
	 @PostMapping("/del/{id}")
     public ModelAndView deleteEmp(@ModelAttribute("tsk1") Tasks tsk1) {
         
        fbservice.deleteTask(tsk1);
        return new ModelAndView("redirect:/loadfeeds");
        }
	 
	 	 
	 @ModelAttribute("severity")
	  public List<String> getSeverityList(){
	    List<String> sever = new ArrayList<>();
	    sever.add("Low");
	    sever.add("Medium");
	    sever.add("High");
	    return sever;
	  }

	

}



//@PostMapping("/delemp/{id}")
//public ModelAndView deleteEmp(@PathVariable("id") int id) {
//	fbservice.deleteTask(id);
//	return new ModelAndView("redirect:/loadfeeds");
//	
//}
//
//
//@GetMapping("/delemp/{id}")
//public ModelAndView delEmp() {
//Tasks e1 = new Tasks();
//return new ModelAndView("delemp","form",e1);
//}

