/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bilgeadam.icerikyonetimi;

import com.bilgeadam.icerikyonetimi.impl.ImplData;
import com.bilgeadam.icerikyonetimi.sorgular.Sorgular;

/**
 *
 * @author MONSTER
 */
public class Runner {

    public static void main(String[] args) {
        
        ImplData.ImplementData();
        
        Sorgular.enCokIcerikUreten();
        
        Sorgular.sorularGeneldeHangiDersten();
    }
}
