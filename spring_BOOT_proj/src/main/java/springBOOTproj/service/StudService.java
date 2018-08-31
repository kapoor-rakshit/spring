package springBOOTproj.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBOOTproj.db_table.STUDRec;

@Service                                               /* Register as a SERVICE */
public class StudService {
	
	@Autowired
	public StudRepository studRepository;
	
	
	
	public List<STUDRec> studrecs = new ArrayList<>(Arrays.asList(
	        new STUDRec(14109025, "Rakshit", "K"),
			new STUDRec(20141014, "Adhish", "K")
			));
	
	                                                 /* FROM ControllerClass */
	
	public List<STUDRec> getAllvals(){               // 3.
		// return studrecs;
		
		                          // using CrudRepository INTERFACE
		
		List<STUDRec> studrecs = new ArrayList<>();
		studRepository.findAll().forEach(studrecs :: add);
		
		return studrecs;
	}
	                    
	                                                 // 4.
	public STUDRec getrecId(int roll) {                
		return studrecs.stream().filter(t -> t.getRoll() == roll).findFirst().get();    // ->  :  iterates to match
	}
	
	                                                // 5.
	public void addSTUD(STUDRec stud) {
		// studrecs.add(stud);
		
		                         // using CrudRepository INTERFACE
		
		studRepository.save(stud);
	}
                                                    // 6.
	
	public void updateSTUD(int roll, STUDRec stud) {
		                                                                            // ->  :  iterate to match
		STUDRec tpstud = studrecs.stream().filter(t -> t.getRoll() == roll).findFirst().get();
		int indexval = studrecs.indexOf(tpstud);
		studrecs.set(indexval, stud);                                              // index, object
	}
                                                    // 7.
	public void deleteSTUD(int roll) {
		
		studrecs.removeIf(t -> t.getRoll() == roll);
	}

}
