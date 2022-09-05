/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.sorgular;

import com.bilgeadam.icerikyonetimi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.repository.entity.User;
import com.bilgeadam.icerikyonetimi.utility.HibernateUtility;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author MONSTER
 */
public class Sorgular {
    static EntityManager entityManager;
    
    public static void enCokIcerikUreten(){
        entityManager=HibernateUtility.getFACTORY().createEntityManager();
        
        String hql = "select sd.user.name,count(sd.user.id) from SubjectDetail as sd group by sd.user.name order by count(sd.user.id) desc";
		Session session = HibernateUtility.getFACTORY().openSession();
		TypedQuery<Object[]> typedQuery = session.createQuery(hql, Object[].class);
		Object[] users = typedQuery.getResultList().get(0);
		//users.forEach(System.out::println);
                 
                System.out.println(("En cok icerik ureten: "+users[0]+ " - "+users[1]));
        
                
    }
    public static void sorularGeneldeHangiDersten(){
        entityManager=HibernateUtility.getFACTORY().createEntityManager();
        String hql="select q.subjectDetail.subject.lesson.name,count(id) from Questions as q group by q.subjectDetail.subject.lesson.name order by count(id) desc ";
        
        Session session = HibernateUtility.getFACTORY().openSession();
        TypedQuery<Object[]> typedQuery = session.createQuery(hql, Object[].class);
        Object[] ders = typedQuery.getResultList().get(0);
        System.out.println("Sorular genelde hangi dersten sorulmus: "+ders[0]);
    }
}
