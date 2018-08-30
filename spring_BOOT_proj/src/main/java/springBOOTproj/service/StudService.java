package springBOOTproj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import springBOOTproj.db_table.STUDRec;

@Service                                               /* Register as a SERVICE */
public class StudService {
	
	public List<STUDRec> studrecs = new ArrayList<>(Arrays.asList(
	        new STUDRec(14109025, "Rakshit", "K"),
			new STUDRec(20141014, "Adhish", "K")
			));
	
	                                                 /* FROM ControllerClass */
	public List<STUDRec> getAllvals(){               // 3.
		return studrecs;
	}
	                    
	                                                 // 4.
	public STUDRec getrecId(int roll) {                
		return studrecs.stream().filter(t -> t.getRoll() == roll).findFirst().get();    // ->  :  iterates to match
	}
	
	                                                // 5.
	public void addSTUD(STUDRec stud) {
		studrecs.add(stud);
	}

}
