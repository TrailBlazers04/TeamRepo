/*
 * @author ayan
 * @version 1.0
 * @author supriya
 * @version 2.0
 */

package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;
import com.lti.entity.StudentDetail;
import com.lti.entity.StudentStat;


@Repository
public class StudentDetailRepoImpl implements StudentDetailRepo{

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(StudentDetail repo) {
		em.persist(repo);

	}
	
	public StudentStat fetch(int id) {
		StudentStat p1=em.find(StudentStat.class,id);
		return p1;
	}
	
	
	@Transactional(value = TxType.REQUIRED)
	public void update(StudentDetail repo) {
		em.merge(repo);
		
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void delete(int id) {
		em.remove(em.find(StudentDetail.class,id));
		
	}

	public List<StudentDetail> fetchAll() {
		return em.createQuery("from StudentDetail").getResultList();
	}

	public StudentDetail fetchDetail(int id) {
		StudentDetail p1=em.find(StudentDetail.class,id);
		return p1;
	}

	public List<StudentDetail> fetchByMark(int marks) {
		String sql1 = "select s FROM StudentDetail s, StudentStat m WHERE m.javaMarks >=: orc ";
		Query q1 =em.createQuery(sql1);
		q1.setParameter("orc",marks);
		
		return q1.getResultList();
	
	}
    
	@Transactional(value = TxType.REQUIRED)
	public void update( int id) {
		StudentDetail s1 = em.find(StudentDetail.class, id);
		em.merge(s1);
		
	}
	
	@Transactional(value = TxType.REQUIRED)
	public StudentStat updateMark( int id) {
		StudentStat s1 = em.find(StudentStat.class, id);
		em.merge(s1);
		return s1;
		
		
	}


	


	
	

	
	

}
