package com.lti.repo;


import java.util.List;

import com.lti.entity.StudentStats;

public interface StudentStatsRepo {
	
	void save(StudentStats repo);
	
	StudentStats fetch(int id);
	
	List<StudentStats> list();
	
	void delete(int id);
	
	void update(StudentStats repo);

<<<<<<< HEAD
}
=======
}
>>>>>>> f31c99e24c390bfe09f5955571e1de303df9fdec
