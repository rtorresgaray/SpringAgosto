/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.jdcb.dao.curso;

import com.rtorres.springagosto.jdcb.helper.GenericDAO;
import com.rtorres.springagosto.jdcb.model.Curso;

/**
 *
 * @author SABADO-MANHANA
 */
public interface CursoDAO extends GenericDAO<Curso> {

    Curso find(String codigo);
}