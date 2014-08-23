
package com.rtorres.springagosto.jdcb.dao;

import com.rtorres.springagosto.jdcb.helper.GenericDAO;
import com.rtorres.springagosto.jdcb.model.Programa;


public interface ProgramaDAO extends GenericDAO<Programa> {

    Programa find(String codigo);
}
