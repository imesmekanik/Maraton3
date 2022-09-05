/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.impl;

import com.bilgeadam.icerikyonetimi.repository.entity.Answers;
import com.bilgeadam.icerikyonetimi.repository.entity.Lesson;
import com.bilgeadam.icerikyonetimi.repository.entity.Questions;
import com.bilgeadam.icerikyonetimi.repository.entity.Role;
import com.bilgeadam.icerikyonetimi.repository.entity.Subject;
import com.bilgeadam.icerikyonetimi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.repository.entity.User;
import com.bilgeadam.icerikyonetimi.utility.HibernateUtility;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MONSTER
 */
public class ImplData {
    private static Session ss;
    private static Transaction tt;
    
    public static void ImplementData(){
        ss = HibernateUtility.getFACTORY().openSession();
        tt = ss.beginTransaction();
        
        Date date = new Date();
        
        //User
        User user1=new User("Mithat", "Orhan", Role.ADMIN,date , date, true);
        User user2=new User("Mert", "Orhan", Role.ADMIN,date , date, true);
        User user3=new User("Zehra", "Orhan", Role.ADMIN,date , date, true);
        
        //Lesson
        Lesson lesson1=new Lesson("lesson1", "description1", date, date, true);
        Lesson lesson2=new Lesson("lesson2", "description2", date, date, true);
        Lesson lesson3=new Lesson("lesson3", "description3", date, date, true);
        Lesson lesson4=new Lesson("lesson4", "description4", date, date, true);
        
        //Subject
        Subject subject1=new Subject("subject1", lesson1, date, date, true);
        Subject subject2=new Subject("subject2", lesson2, date, date, true);
        Subject subject3=new Subject("subject3", lesson3, date, date, true);
        Subject subject4=new Subject("subject4", lesson4, date, date, true);
        
        //SubjectDetail
        SubjectDetail subjectDetail1=new SubjectDetail(subject1, user1, "title1", "description1", "article1", date, date, true);
        SubjectDetail subjectDetail2=new SubjectDetail(subject2, user2, "title2", "description2", "article2", date, date, true);
        SubjectDetail subjectDetail3=new SubjectDetail(subject3, user3, "title3", "description3", "article3", date, date, true);
        SubjectDetail subjectDetail4=new SubjectDetail(subject4, user3, "title4", "description4", "article4", date, date, true);
        
        //Questions
        Questions questions1=new Questions(subjectDetail1,List.of(user1,user2) , "title1", "question1", date, date, true);
        Questions questions2=new Questions(subjectDetail2, List.of(user1), "title2", "question2", date, date, true);
        Questions questions3=new Questions(subjectDetail2, List.of(user3), "title3", "question3", date, date, true);
        Questions questions4=new Questions(subjectDetail3, List.of(user3), "title3", "question3", date, date, true);
        Questions questions5=new Questions(subjectDetail4, List.of(user3), "title3", "question3", date, date, true);
        
        //Answers
        Answers answers1=new Answers(questions1, List.of(user1), "answer1", date, date, true);
        Answers answers2=new Answers(questions2, List.of(user1,user2), "answer2", date, date, true);
        Answers answers3=new Answers(questions3, List.of(user3,user2), "answer3", date, date, true);
        Answers answers4=new Answers(questions4, List.of(user3,user2), "answer3", date, date, true);
        Answers answers5=new Answers(questions5, List.of(user3,user2), "answer3", date, date, true);
        
        ss.save(answers1);
        ss.save(answers2);
        ss.save(answers3);
        ss.save(answers4);
        ss.save(answers5);
        
        ss.getTransaction().commit();
        ss.close();
    }
}
