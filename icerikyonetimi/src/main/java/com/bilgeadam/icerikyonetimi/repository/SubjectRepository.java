/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.repository.entity.Subject;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

/**
 *
 * @author MONSTER
 */
public class SubjectRepository extends MyFactoryRepository<Subject,Long> {

    public SubjectRepository() {
        super(new Subject());
    }
    
}
