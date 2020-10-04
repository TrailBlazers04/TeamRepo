/*
 * @author ayan
 * @version 1.0
 * @author supriya
 * @version 2.0
 */

package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
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

	/*
	 * public List<StudentDetail> fetchByMark(int marks) { String sql1 =
	 * " select * from students where user_id in (select user_id from studentmark where javamarks>=: orc)"
	 * ; Query q1 =em.createNativeQuery(sql1); q1.setParameter("orc",marks);
	 * 
	 * return q1.getResultList(); }
	 */

	public List<StudentDetail> fetchStudentByEmail(String email) {
		Query query = em.createQuery("SELECT c FROM StudentDetail c WHERE c.email =:orc");
		query.setParameter("orc", email);
		
		return query.getResultList();
	}
	
	public List<StudentDetail> fetchStudentByEmailAndPassword(String email, String password) {
		Query query = em.createQuery("SELECT c FROM StudentDetail c WHERE c.email =:orc AND c.password =:xrl");
		query.setParameter("orc", email);
		query.setParameter("xrl", password);
		
		return query.getResultList();
	}


}
