/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.jdcb.dao;
import com.rtorres.springagosto.jdcb.model.Programa;
import java.util.List;

/**
 *
 * @author SABADO-MANHANA
 */
public interface ProgramaDAO {
    List<Programa> all();
    Programa find(Long id);
    void save(Programa programa);
    void update(Programa programa);
    void delete(Programa programa);
    
    Programa find(String nombre);
    
}
