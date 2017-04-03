/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nirwansyah.springboot.controller;

import com.nirwansyah.springboot.entities.Nasabah;
import com.nirwansyah.springboot.service.NasabahService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dickajava
 */
@Controller
@RequestMapping(value = "/Nasabah")
public class ControllerPelatihanBanking extends HttpServlet{
    
    @Autowired
    private NasabahService nasabahService;
    
    @RequestMapping(value = "/Data", method = RequestMethod.GET)
    public String index(Model model, ModelMap map){
        try {
            model.addAttribute("listNasabah", nasabahService.getFindAll());
            map.put("title", "Data Nasabah");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ListNasabah";
    }
    
    @RequestMapping(value = "/Delete/{idnasabah}", method = RequestMethod.GET)
    public String delete(@PathVariable("idnasabah")int idnasabah){
        
        Nasabah nasabah=nasabahService.getFindById(idnasabah);
        nasabahService.DeleteNasabah(nasabah);
        return "redirect:/Nasabah/Data";
    }
    
    @RequestMapping(value = "/Update/{idnasabah}", method = RequestMethod.GET)
    public String update(@PathVariable("idnasabah")int idnasabah, Model model){
       
        Nasabah nasabah=nasabahService.getFindById(idnasabah);
        model.addAttribute("getnasabah", nasabah);
        return "UpdateNasabah";
    }
    
    @RequestMapping(value = "/prosesUpdate", method = RequestMethod.POST)
    public String prosesUpdate(HttpServletRequest request)
            throws ServletException, IOException{
        
        Nasabah nasabah=new Nasabah();
        String idnasabah=request.getParameter("idnasabah");
        nasabah.setIdnasabah(Integer.parseInt(idnasabah));
        nasabah.setNama(request.getParameter("nama"));
        nasabah.setNotelp(request.getParameter("notelp"));
        nasabah.setAlamat(request.getParameter("alamat"));
        nasabahService.SaveNasabah(nasabah);
       return "redirect:/Nasabah/Data";
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(HttpServletRequest request)
            throws ServletException, IOException{
        
        Nasabah nasabah=new Nasabah();
        nasabah.setNama(request.getParameter("nama"));
        nasabah.setNotelp(request.getParameter("notelp"));
        nasabah.setAlamat(request.getParameter("alamat"));
        nasabahService.SaveNasabah(nasabah);
        return "redirect:/Nasabah/Data";
    }
}
