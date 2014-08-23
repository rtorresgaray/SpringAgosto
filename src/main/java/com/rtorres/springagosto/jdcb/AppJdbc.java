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

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
        AppJdbc.doDelete(context);
        
/*        AppJdbc.doUpdate(context);
        AppJdbc.doFind2(context);*/
    }

    public static void doFind(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(1l);
        System.out.println(programa.getNombre());
    }

    public static void doFind2(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find("333");
        System.out.println(programa.getNombre());
    }

    public static void docList(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> Programas = programaDAO.all();
        for (Programa programa : Programas) {
            System.out.println(programa.getNombre());
        }

    }

    public static void doSave(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setCodigo("127");
        programa.setDescripcion("Desarrollo de Software");
        programa.setNombre("RUN");
        programaDAO.save(programa);
    }

    public static void doUpdate(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find("127");

        programa.setCodigo("333");
        programa.setDescripcion("Desarrollo de Software");
        programa.setNombre("APP RUN");
        programaDAO.update(programa);
    }
    
    public static void doDelete(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find("333");
        programaDAO.delete(programa.getId());
    }    


}
