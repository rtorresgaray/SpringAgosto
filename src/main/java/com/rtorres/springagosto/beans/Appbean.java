/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.beans;

import com.rtorres.springagosto.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SABADO-TARDE
 */
public class Appbean {
    
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("app.xml");
//        Appbean.valoresConstructor(context);
  //      Appbean.referenciaConstructor(context);
        Appbean.valoresMetodos(context);
      
    }
    
    public static void referenciaConstructor(ApplicationContext context){
    Musico musico=(Musico) context.getBean("slash");
    System.out.println(musico.getInstrumento().getMarca());
    }
    
    public static void valoresConstructor(ApplicationContext context){
            
    Musico bob=(Musico) context.getBean("bob");
    System.out.println(bob.getNumeroCanciones());
    }
    
    public static void valoresMetodos(ApplicationContext context){
            
    Musico bob=(Musico) context.getBean("lennon");
    System.out.println(bob.getNombre()+" canciones: "+ bob.getNumeroCanciones());
    }    
    
    
}
