/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.orm;



import com.rtorres.springagosto.orm.dao.ProgramaDAO;
import com.rtorres.springagosto.orm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author DOMINGO
 */
public class AppOrm {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernetDB.xml");
 /*       AppOrm.docInsert(context); */
        AppOrm.doUpdate(context);
        AppOrm.docList(context);    
            
    }

    public static void docInsert(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa= new Programa();
        programa.setCodigo("999");
        programa.setNombre("GENERAL");
        programaDAO.save(programa);
        }
    
    public static void docList(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> Programas = programaDAO.all();
        for (Programa programa : Programas) {
            System.out.println(programa.getNombre());
        }

    }
    
    public static void doUpdate(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(9l);
        programa.setCodigo("222");
        programa.setDescripcion("Desarrollo de Software");
        programa.setNombre("APP 2");
        programaDAO.update(programa);
    } 
    
}