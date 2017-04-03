/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nirwansyah.springboot.service;

import com.nirwansyah.springboot.entities.Nasabah;

/**
 *
 * @author dickajava
 */
public interface NasabahService {
    
    public Iterable<Nasabah> getFindAll();
    
    public Nasabah getFindById(int id);
    
    public void SaveNasabah(Nasabah nasabah);
    
    public void DeleteNasabah(Nasabah nasabah);
    
 
}
