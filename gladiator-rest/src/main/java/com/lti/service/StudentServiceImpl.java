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

	public List<StudentDetail> findByEmail(String email) {
		 return repo.fetchStudentByEmail(email);
	}
	
	public StudentDetail find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentStat fetch(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<StudentDetail> load() {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(int id) {
		// TODO Auto-generated method stub

	}

	public void edit(StudentDetail stu) {
		// TODO Auto-generated method stub

	}

	public List<StudentDetail> findStudentByEmailAndPassword(String email, String password) {
		return repo.fetchStudentByEmailAndPassword(email, password);
	}

}
