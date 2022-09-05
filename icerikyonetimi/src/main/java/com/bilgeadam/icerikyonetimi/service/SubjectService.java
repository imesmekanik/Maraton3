/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.repository.SubjectRepository;
import com.bilgeadam.icerikyonetimi.repository.entity.Subject;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

/**
 *
 * @author MONSTER
 */
public class SubjectService extends MyFactoryService<SubjectRepository, Subject, Long> {

    public SubjectService() {
        super(new SubjectRepository());
    }
    
}