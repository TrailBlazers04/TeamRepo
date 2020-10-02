/*
 * @author ayan
 * @version 1.0
 * @author supriya
 * @version 2.0
 */

package com.lti.repo;

import java.util.List;

import com.lti.entity.StudentDetail;
import com.lti.entity.StudentStat;


public interface StudentDetailRepo {

    void save(StudentDetail repo);
	
	StudentStat fetch(int id);
	
	StudentDetail fetchDetail(int id);
	
	List<StudentDetail> fetchAll();
	
	List<StudentDetail> fetchByMark(int marks);
	
	void delete(int id);
	
	void update(StudentDetail repo);
	
	void update(int id);
	
	StudentStat updateMark(int id);
	
	
}
