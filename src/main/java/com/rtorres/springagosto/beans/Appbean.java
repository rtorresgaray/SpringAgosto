/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtorres.springagosto.beans;

import com.rtorres.springagosto.beans.model.Instrumento;
import com.rtorres.springagosto.beans.model.Musico;
import java.util.List;
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
    //    Appbean.valoresMetodos(context);
    //    Appbean.ReferenciaMetodos(context);
   //     Appbean.ReferenciaListado(context);
        //Appbean.autowireByName(context);
        Appbean.autowire(context);
        
      
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
    
     public static void ReferenciaMetodos(ApplicationContext context){
    Musico musico = (Musico)  context.getBean("lennon");
    System.out.println(musico.getNombre()+" canciones: "+ musico.getNumeroCanciones());
    System.out.println(musico.getInstrumento().getMarca());
    }  
     
     
      public static void ReferenciaInterna(ApplicationContext context){
          Musico musico = (Musico) context.getBean("james");
          System.out.println(musico.getNombre());
          System.out.println(musico.getInstrumento().getMarca());
      }
    
      public static void ReferenciaListado(ApplicationContext context){
          Musico musico=(Musico) context.getBean("jimmy");
          List<Instrumento> instrumentos =musico.getInstrumentos();
         for (Instrumento instrumento : instrumentos){
             System.out.println(instrumento.getMarca());
         }         
      }
     
      public static void autowireByName(ApplicationContext context){
          Musico musico = (Musico) context.getBean("noel");
          System.out.println(musico.getInstrumento().getMarca());      
         }                   
      
    public static void autowire(ApplicationContext context){
          Musico noel = (Musico) context.getBean("noel");
          System.out.println(noel.getInstrumento().getMarca());      
          
          Musico cerati = (Musico) context.getBean("cerati");
          System.out.println(cerati.getInstrumento().getMarca());      
          
          Musico charly = (Musico) context.getBean("charly");
          System.out.println(cerati.getInstrumento().getMarca());                
          
         }
    
    
      
}
