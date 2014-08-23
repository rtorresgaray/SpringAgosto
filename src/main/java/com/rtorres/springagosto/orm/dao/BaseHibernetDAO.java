/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.orm.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseHibernetDAO extends HibernateDaoSupport{
    @Autowired
public void initSession(SessionFactory sessionFactory) {
setSessionFactory(sessionFactory);
}
}