/*
 * @author
 * S Supriya
 * @version
 * 1.0
 */

package com.lti.service;

import java.util.List;

import com.lti.entity.StudentDetail;
import com.lti.entity.StudentStat;

public interface StudentService {
	
    void persist(StudentDetail student);
	
	
	StudentDetail find(int id);
	
	StudentStat fetch(int id);
	
	List<StudentDetail> load();
	
	void remove(int id);
	
	void edit(int id);
	
	StudentStat editMark(int id);
	

}
