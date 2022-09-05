/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.repository;

import com.bilgeadam.icerikyonetimi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryRepository;

/**
 *
 * @author MONSTER
 */
public class SubjectDetailRepository extends MyFactoryRepository<SubjectDetail,Long> {

    public SubjectDetailRepository() {
        super(new SubjectDetail());
    }
    
}
