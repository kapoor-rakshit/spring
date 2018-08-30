package springBOOTproj.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBOOTproj.db_table.STUDRec;
import springBOOTproj.service.StudService;

@RestController
public class ControllerClass {
	
	@RequestMapping("/")
	public String homepage() {
		return "HOME PAGE";
	}

	@RequestMapping("/home")             /* 1. This will work for /home/ as well but not vice-versa */
	public String homeagain() {
		return "AGAIN HOME page";
	}
	
	                                    /* 2. Return OBJECT from controller with a suitable conversion (handled by SPRING MVC) to server */
//	@RequestMapping("/stud")
//	public List<STUDRec> getalltopic(){
//		return Arrays.asList(
//				new STUDRec(14109025, "Rakshit", "K"),
//				new STUDRec(20141014, "Adhish", "K")
//				);
//	}
	
	                                  /* 3. Return OBJECT using SERVICE */
	@Autowired
	public StudService studservice;
	
	@RequestMapping("/stud")
	public List<STUDRec> getALL(){
		return studservice.getAllvals();
	}
	
	                                  /* 4. Return OBJECT for only a particular record , var in url */
	@RequestMapping("/stud/{var}")
	public STUDRec getREC(@PathVariable("var") int roll) {
		return studservice.getrecId(roll);
	}
	
	                                   /* 5. POST request on a method */
	
	@RequestMapping(method=RequestMethod.POST, value="/stud")         // define POST request on which url
	public void addstud(@RequestBody STUDRec stud) {                 //convert JSON received to an instance of class
		studservice.addSTUD(stud);
	}
	
}
