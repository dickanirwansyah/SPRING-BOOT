/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nirwansyah.springboot.service;

import com.nirwansyah.springboot.dao.NasabahDAO;
import com.nirwansyah.springboot.entities.Nasabah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dickajava
 */
@Service("nasabahService")
@Transactional
public class NasabahServiceImpl implements NasabahService{

    @Autowired
    private NasabahDAO nasabahDAO;
    
    @Override
    public Iterable<Nasabah> getFindAll() {
      return nasabahDAO.findAll();
    }

    @Override
    public Nasabah getFindById(int id) {
     return nasabahDAO.findOne(id);
    }

    @Override
    public void SaveNasabah(Nasabah nasabah) {
      nasabahDAO.save(nasabah);
    }

    @Override
    public void DeleteNasabah(Nasabah nasabah) {
     nasabahDAO.delete(nasabah);
    }

   
    

    
}
