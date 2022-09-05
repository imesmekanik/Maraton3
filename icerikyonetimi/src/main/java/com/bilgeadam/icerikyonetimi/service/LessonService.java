/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.repository.LessonRepository;
import com.bilgeadam.icerikyonetimi.repository.entity.Lesson;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

/**
 *
 * @author MONSTER
 */
public class LessonService extends MyFactoryService<LessonRepository, Lesson, Long> {

    public LessonService() {
        super(new LessonRepository());
    }
    
}