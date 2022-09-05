/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.repository.QuestionsRepository;
import com.bilgeadam.icerikyonetimi.repository.entity.Questions;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

/**
 *
 * @author MONSTER
 */
public class QuestionsService extends MyFactoryService<QuestionsRepository, Questions, Long> {

    public QuestionsService() {
        super(new QuestionsRepository());
    }
    
}