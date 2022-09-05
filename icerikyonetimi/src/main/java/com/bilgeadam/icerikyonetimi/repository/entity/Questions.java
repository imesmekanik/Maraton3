/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.repository.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MONSTER
 */
@Entity
@Table(name = "tblquestions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @OneToOne(cascade = CascadeType.ALL)
    private SubjectDetail subjectDetail;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "questions_user",
    joinColumns = { @JoinColumn(name = "tblquestions") },
    inverseJoinColumns = { @JoinColumn(name = "tbluser") })
    private List<User> user;
    String title;
    String question;
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    boolean enabled;

    public Questions() {
    }

    public Questions(SubjectDetail subjectDetail, List<User> user, String title, String question, Date createdAt, Date updatedAt, boolean enabled) {
        this.subjectDetail = subjectDetail;
        this.user = user;
        this.title = title;
        this.question = question;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.enabled = enabled;
    }

    public Questions(Long Id, SubjectDetail subjectDetail, List<User> user, String title, String question, Date createdAt, Date updatedAt, boolean enabled) {
        this.Id = Id;
        this.subjectDetail = subjectDetail;
        this.user = user;
        this.title = title;
        this.question = question;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.enabled = enabled;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public SubjectDetail getSubjectDetail() {
        return subjectDetail;
    }

    public void setSubjectDetail(SubjectDetail subjectDetail) {
        this.subjectDetail = subjectDetail;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "Questions{" + "Id=" + Id + ", subjectDetail=" + subjectDetail + ", user=" + user + ", title=" + title + ", question=" + question + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", enabled=" + enabled + '}';
    }

    
    
}
