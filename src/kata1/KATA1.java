/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class KATA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Hola");
       Person2 P2;
       //Date f = new Date(91,8,19);
       
       Calendar f1;
       f1 = GregorianCalendar.getInstance();
       f1.set(1991,8,19);
       
       P2 = new Person2 ("Alexis", "Valencia", f1);
       System.out.println(P2.getFullName());
       System.out.println(P2.getAge());
       System.out.println(P2.getBirthday().getTime());
       System.out.println("adios");
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* System.out.println("Hola");
        Person p1;
        
        Date f = new Date(91,8,19);
        
        p1 = new Person("Alexis", "Valencia", f);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirth());
        System.out.println(p1.getAge());
        
        System.out.println("Adios");*/
        
        
        
        
    }
}
