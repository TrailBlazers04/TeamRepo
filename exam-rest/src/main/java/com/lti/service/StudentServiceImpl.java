/*
 * @author
 * S Supriya
 * @version
 * 1.0
 */


package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.StudentDetail;
import com.lti.entity.StudentStat;
import com.lti.repo.StudentDetailRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDetailRepo repo;
    
	@Transactional(value = TxType.REQUIRED)
	public void persist(StudentDetail student) {
		repo.save(student);

	}

	public StudentDetail find(int id) {
		return repo.fetchDetail(id);
	}

	public List<StudentDetail> load() {
		return repo.fetchAll();
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void remove(int id) {
		repo.delete(id);

	}
    
	@Transactional(value = TxType.REQUIRED)
	public void edit(int id) {
		
		repo.update(id);

	}

	public StudentStat fetch(int id) {
		return repo.fetch(id);
	}

	public StudentStat editMark(int id) {
		
		return repo.updateMark(id);
		
		
		
	}

	

}
