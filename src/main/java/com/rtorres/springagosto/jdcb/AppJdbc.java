/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.jdcb;

import com.rtorres.springagosto.jdcb.dao.ProgramaDAO;
import com.rtorres.springagosto.jdcb.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SABADO-MANHANA
 */
public class AppJdbc {
    
    public static void main(String[] args){
            ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
            AppJdbc.docList(context);
        }        
 
       public static void docList(ApplicationContext context) {
           ProgramaDAO programaDAO = (ProgramaDAO)  context.getBean("programaDAO");
           List<Programa> Programas =programaDAO.all();
           for (Programa programa : Programas) {
               System.out.println(programa.getNombre());
           }
                  
        }        
    
}
