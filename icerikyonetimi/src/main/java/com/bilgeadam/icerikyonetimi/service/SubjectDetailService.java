/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.repository.SubjectDetailRepository;
import com.bilgeadam.icerikyonetimi.repository.entity.SubjectDetail;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

/**
 *
 * @author MONSTER
 */
public class SubjectDetailService extends MyFactoryService<SubjectDetailRepository, SubjectDetail, Long> {

    public SubjectDetailService() {
        super(new SubjectDetailRepository());
    }
    
}