package com.rtorres.springagosto.orm.dao.hibernate;

import com.rtorres.springagosto.orm.model.Programa;
import com.rtorres.springagosto.orm.dao.BaseHibernetDAO;
import com.rtorres.springagosto.orm.dao.ProgramaDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("programaDAO")
public class ProgramaDAOH extends BaseHibernetDAO implements ProgramaDAO{

    public List<Programa> all() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    public Programa find(Long id) {
        Criteria criteria= this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", id));
        return (Programa) criteria.uniqueResult();
    }

    public void save(Programa t) {
        this.getSession().save(t);
    }

    public void update(Programa t) {
        this.getSession().update(t);
    }
    
    public void delete(Programa t) {
        this.getSession().delete(t);
    }
    

    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Programa find(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
}
