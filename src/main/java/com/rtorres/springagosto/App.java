package com.rtorres.springagosto;

import com.rtorres.springagosto.beans.model.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Persona persona = (Persona) context.getBean("persona");
        
        System.out.println(persona.getNombre());
    }
}
