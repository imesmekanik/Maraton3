/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    /**
     * Hibernate üzserinden bağlantı kurabilmek için Oturuma ihtiyaç duyarız bunu sağlamak için 
     * hibernate.cfg.xml üzerindeki ayarları kullanarak bir oturum oluşturulur.
     */
    private static final SessionFactory FACTORY;

    static{
        try {
            /**
             * default olarak src/main/resources/hibernate.cfg.xml aranır.
             * değiştirmek için
             * FACTORY = new  Configuration().configure("hibernate-okul.cfg.xml").buildSessionFactory();
             */
            FACTORY = new  Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
    
    
}
