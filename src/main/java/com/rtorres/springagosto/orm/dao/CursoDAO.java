/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.orm.dao;



import com.rtorres.springagosto.orm.helper.GenericDAO;
import com.rtorres.springagosto.orm.model.Curso;

/**
 *
 * @author SABADO-MANHANA
 */
public interface CursoDAO extends GenericDAO<Curso> {

    Curso find(String codigo);
}