
package com.rtorres.springagosto.orm.dao;


import com.rtorres.springagosto.orm.model.Programa;
import com.rtorres.springagosto.orm.helper.GenericDAO;


public interface ProgramaDAO extends GenericDAO<Programa> {

    Programa find(String codigo);
}
